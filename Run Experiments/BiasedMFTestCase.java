/**
 * Copyright (C) 2016 LibRec
 * 
 * This file is part of LibRec.
 * LibRec is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LibRec is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LibRec. If not, see <http://www.gnu.org/licenses/>.
 */
package net.librec.recommender.cf.rating;

import net.librec.BaseTestCase;
import net.librec.common.LibrecException;
import net.librec.conf.Configuration;
import net.librec.conf.Configuration.Resource;
import net.librec.job.RecommenderJob;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * BasedMF Test Case corresponds to BasedMFRecommender
 * {@link net.librec.recommender.cf.rating.BiasedMFRecommender}
 * 
 * @author liuxz
 */
public class BiasedMFTestCase extends BaseTestCase {

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * test the whole process of BasedMF recommendation
	 * 
	 * @throws ClassNotFoundException
	 * @throws LibrecException
	 * @throws IOException
	 */
	@Test
	public void testRecommender() throws ClassNotFoundException, LibrecException, IOException {
		String[] location = {"filmtrust/data2", "filmtrust/data4", "filmtrust/data10","filmtrust/data15", "filmtrust/data20", "filmtrust/data35"};
		String[] testSet =  {"filmtrust/data2/dogo_test_set_2_above_ratings.txt", "filmtrust/data4/dogo_test_set_4_above_ratings.txt", "filmtrust/data10/dogo_test_set_10_above_ratings.txt","filmtrust/data15/dogo_test_set_15_above_ratings.txt", "filmtrust/data20/dogo_test_set_20_above_ratings.txt", "filmtrust/data35/dogo_test_set_35_above_ratings.txt"};
		for(int y = 0; y < 6; y++) {
			System.out.println("Testing " + location[y]);

			for (int x = 20; x < 121; x += 20) {
				conf.set("data.input.path", location[y]);
				conf.set("data.testset.path", testSet[y]);

				if (x == 100) {
					x = 120;
				}
				System.out.println("Factor number = " + x);
				Resource resource = new Resource("rec/cf/rating/biasedmf-test.properties");
				conf.addResource(resource);
				conf.set("rec.factor.number", Integer.toString(x));
				RecommenderJob job = new RecommenderJob(conf);
				job.runJob();
				conf = new Configuration();
				System.out.println();
			}
		}
	}
}

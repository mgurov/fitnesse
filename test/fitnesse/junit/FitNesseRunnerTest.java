package fitnesse.junit;

import org.junit.runner.RunWith;

@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite("StopOnAnyError.FaultyTest")
@FitNesseRunner.FitnesseDir(".")
@FitNesseRunner.OutputDir("./target/fitnesse-results")
public class FitNesseRunnerTest {
}

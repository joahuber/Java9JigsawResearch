package ch.bbv.moduledemo;

import de.schauderhaft.degraph.check.ConstraintBuilder;

import org.junit.Test;

import static de.schauderhaft.degraph.check.Check.classpath;
import static de.schauderhaft.degraph.check.JCheck.violationFree;
import static org.junit.Assert.assertThat;

public class DegraphCheck {

  @Test
  public void checkForCycles() {
    ConstraintBuilder parts = classpath() //
        .including("ch.bbv.moduledemo.**") //
        .noJars() //
        .withSlicing("part", "ch.bbv.moduledemo.(*).**")//
        .allow("infrastructure", "adapter", "application", "domain") //
        .printTo("build/degraph.graphml");

    assertThat(parts, violationFree());
  }
}

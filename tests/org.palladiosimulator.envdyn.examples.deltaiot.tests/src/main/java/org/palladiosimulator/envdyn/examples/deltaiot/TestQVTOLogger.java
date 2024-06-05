package org.palladiosimulator.envdyn.examples.deltaiot;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.m2m.qvt.oml.util.Log;

public class TestQVTOLogger implements Log {
    private static final Logger LOGGER = Logger.getLogger(TestQVTOLogger.class);

    @Override
    public void log(String message) {
        log(1, message, null);
    }

    @Override
    public void log(int level, String message) {
        log(level, message, null);
    }

    @Override
    public void log(String message, Object param) {
        log(1, message, param);
    }

    @Override
    public void log(int level, String message, Object param) {
        final String paramToString = param == null ? "" : " <" + param + ">";
        if (LOGGER.isEnabledFor(Level.INFO)) {
            LOGGER.info(message + paramToString);
        }
    }
}

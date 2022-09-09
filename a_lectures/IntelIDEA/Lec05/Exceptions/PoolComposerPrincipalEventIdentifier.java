package a_lectures.IntelIDEA.Lec05.Exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PoolComposerPrincipalEventIdentifier {
    private static final Logger LOG = Logger.getLogger(
            PoolComposerPrincipalEventIdentifier.class.getName());

    public void identifyPrincipalEvent() {
        try {
            doIdentifyPrincipalEventUsingPoolComposer();
        }
        catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error while ident", ex);
        }
    }

    private void doIdentifyPrincipalEventUsingPoolComposer() {
    }
}

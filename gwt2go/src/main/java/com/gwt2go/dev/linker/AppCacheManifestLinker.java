package com.gwt2go.dev.linker;

import com.google.gwt.core.ext.linker.Shardable;

/**
 * Application Linker creates the cacheable manifest file
 *
 * @author L.Pelov
 */
@Shardable
public class AppCacheManifestLinker extends ManifestLinker {

    @Override
    protected String[] otherCachedFiles() {
        return new String[] { "/2Gwt2go.html", "/2Gwt2go.css" }; //$NON-NLS-1$ //$NON-NLS-2$
    }

    @Override
    protected String appCacheManifestTemplate() {
        return "myappcache.manifest"; //$NON-NLS-1$
    }
}

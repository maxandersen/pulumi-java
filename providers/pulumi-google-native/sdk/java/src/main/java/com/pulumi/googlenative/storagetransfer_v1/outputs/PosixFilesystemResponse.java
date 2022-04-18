// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PosixFilesystemResponse {
    /**
     * Root directory path to the filesystem.
     * 
     */
    private final String rootDirectory;

    @CustomType.Constructor
    private PosixFilesystemResponse(@CustomType.Parameter("rootDirectory") String rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    /**
     * Root directory path to the filesystem.
     * 
    */
    public String rootDirectory() {
        return this.rootDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PosixFilesystemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String rootDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(PosixFilesystemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rootDirectory = defaults.rootDirectory;
        }

        public Builder rootDirectory(String rootDirectory) {
            this.rootDirectory = Objects.requireNonNull(rootDirectory);
            return this;
        }        public PosixFilesystemResponse build() {
            return new PosixFilesystemResponse(rootDirectory);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LibraryResponse {
    /**
     * Name of the library. Example: "django".
     * 
     */
    private final String name;
    /**
     * Version of the library to select, or "latest".
     * 
     */
    private final String version;

    @CustomType.Constructor
    private LibraryResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("version") String version) {
        this.name = name;
        this.version = version;
    }

    /**
     * Name of the library. Example: "django".
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Version of the library to select, or "latest".
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public LibraryResponse build() {
            return new LibraryResponse(name, version);
        }
    }
}

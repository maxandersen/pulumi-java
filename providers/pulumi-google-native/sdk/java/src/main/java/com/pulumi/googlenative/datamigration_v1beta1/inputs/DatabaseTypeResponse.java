// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A message defining the database engine and provider.
 * 
 */
public final class DatabaseTypeResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatabaseTypeResponse Empty = new DatabaseTypeResponse();

    /**
     * The database engine.
     * 
     */
    @Import(name="engine", required=true)
      private final String engine;

    public String engine() {
        return this.engine;
    }

    /**
     * The database provider.
     * 
     */
    @Import(name="provider", required=true)
      private final String provider;

    public String provider() {
        return this.provider;
    }

    public DatabaseTypeResponse(
        String engine,
        String provider) {
        this.engine = Objects.requireNonNull(engine, "expected parameter 'engine' to be non-null");
        this.provider = Objects.requireNonNull(provider, "expected parameter 'provider' to be non-null");
    }

    private DatabaseTypeResponse() {
        this.engine = null;
        this.provider = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String engine;
        private String provider;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engine = defaults.engine;
    	      this.provider = defaults.provider;
        }

        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        public Builder provider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }        public DatabaseTypeResponse build() {
            return new DatabaseTypeResponse(engine, provider);
        }
    }
}

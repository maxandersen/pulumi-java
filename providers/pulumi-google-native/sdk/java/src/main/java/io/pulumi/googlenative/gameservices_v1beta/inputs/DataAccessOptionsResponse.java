// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Write a Data Access (Gin) log
 * 
 */
public final class DataAccessOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataAccessOptionsResponse Empty = new DataAccessOptionsResponse();

    @Import(name="logMode", required=true)
      private final String logMode;

    public String logMode() {
        return this.logMode;
    }

    public DataAccessOptionsResponse(String logMode) {
        this.logMode = Objects.requireNonNull(logMode, "expected parameter 'logMode' to be non-null");
    }

    private DataAccessOptionsResponse() {
        this.logMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataAccessOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DataAccessOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logMode = defaults.logMode;
        }

        public Builder logMode(String logMode) {
            this.logMode = Objects.requireNonNull(logMode);
            return this;
        }        public DataAccessOptionsResponse build() {
            return new DataAccessOptionsResponse(logMode);
        }
    }
}

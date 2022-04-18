// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetHealthCheckLogConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetHealthCheckLogConfig Empty = new GetHealthCheckLogConfig();

    @Import(name="enable", required=true)
      private final Boolean enable;

    public Boolean enable() {
        return this.enable;
    }

    public GetHealthCheckLogConfig(Boolean enable) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
    }

    private GetHealthCheckLogConfig() {
        this.enable = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthCheckLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }        public GetHealthCheckLogConfig build() {
            return new GetHealthCheckLogConfig(enable);
        }
    }
}

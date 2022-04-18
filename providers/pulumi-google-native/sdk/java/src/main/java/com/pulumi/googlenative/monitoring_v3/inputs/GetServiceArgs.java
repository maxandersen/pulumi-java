// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceArgs Empty = new GetServiceArgs();

    @Import(name="serviceId", required=true)
      private final String serviceId;

    public String serviceId() {
        return this.serviceId;
    }

    @Import(name="v3Id", required=true)
      private final String v3Id;

    public String v3Id() {
        return this.v3Id;
    }

    @Import(name="v3Id1", required=true)
      private final String v3Id1;

    public String v3Id1() {
        return this.v3Id1;
    }

    public GetServiceArgs(
        String serviceId,
        String v3Id,
        String v3Id1) {
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
        this.v3Id = Objects.requireNonNull(v3Id, "expected parameter 'v3Id' to be non-null");
        this.v3Id1 = Objects.requireNonNull(v3Id1, "expected parameter 'v3Id1' to be non-null");
    }

    private GetServiceArgs() {
        this.serviceId = null;
        this.v3Id = null;
        this.v3Id1 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serviceId;
        private String v3Id;
        private String v3Id1;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceId = defaults.serviceId;
    	      this.v3Id = defaults.v3Id;
    	      this.v3Id1 = defaults.v3Id1;
        }

        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder v3Id(String v3Id) {
            this.v3Id = Objects.requireNonNull(v3Id);
            return this;
        }
        public Builder v3Id1(String v3Id1) {
            this.v3Id1 = Objects.requireNonNull(v3Id1);
            return this;
        }        public GetServiceArgs build() {
            return new GetServiceArgs(serviceId, v3Id, v3Id1);
        }
    }
}

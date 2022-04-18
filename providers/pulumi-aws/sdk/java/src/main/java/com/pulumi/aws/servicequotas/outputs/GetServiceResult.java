// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicequotas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Code of the service.
     * 
     */
    private final String serviceCode;
    private final String serviceName;

    @CustomType.Constructor
    private GetServiceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("serviceCode") String serviceCode,
        @CustomType.Parameter("serviceName") String serviceName) {
        this.id = id;
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Code of the service.
     * 
    */
    public String serviceCode() {
        return this.serviceCode;
    }
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String serviceCode;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.serviceCode = defaults.serviceCode;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder serviceCode(String serviceCode) {
            this.serviceCode = Objects.requireNonNull(serviceCode);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GetServiceResult build() {
            return new GetServiceResult(id, serviceCode, serviceName);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * A map contains the attributes of the instance. Check the [doc](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#API_RegisterInstance_RequestSyntax) for the supported attributes and syntax.
     * 
     */
    @Import(name="attributes", required=true)
      private final Output<Map<String,String>> attributes;

    public Output<Map<String,String>> attributes() {
        return this.attributes;
    }

    /**
     * The ID of the service instance.
     * 
     */
    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The ID of the service that you want to use to create the instance.
     * 
     */
    @Import(name="serviceId", required=true)
      private final Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }

    public InstanceArgs(
        Output<Map<String,String>> attributes,
        Output<String> instanceId,
        Output<String> serviceId) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private InstanceArgs() {
        this.attributes = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.serviceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> attributes;
        private Output<String> instanceId;
        private Output<String> serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.instanceId = defaults.instanceId;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder attributes(Output<Map<String,String>> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(Map<String,String> attributes) {
            this.attributes = Output.of(Objects.requireNonNull(attributes));
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder serviceId(Output<String> serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Output.of(Objects.requireNonNull(serviceId));
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(attributes, instanceId, serviceId);
        }
    }
}

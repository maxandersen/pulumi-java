// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecEgressPolicyEgressToArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecEgressPolicyEgressToArgs Empty = new ServicePerimeterSpecEgressPolicyEgressToArgs();

    /**
     * A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * 
     */
    @Import(name="operations")
      private final @Nullable Output<List<ServicePerimeterSpecEgressPolicyEgressToOperationArgs>> operations;

    public Output<List<ServicePerimeterSpecEgressPolicyEgressToOperationArgs>> operations() {
        return this.operations == null ? Codegen.empty() : this.operations;
    }

    /**
     * A list of resources, currently only projects in the form
     * `projects/&lt;projectnumber&gt;`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> resources() {
        return this.resources == null ? Codegen.empty() : this.resources;
    }

    public ServicePerimeterSpecEgressPolicyEgressToArgs(
        @Nullable Output<List<ServicePerimeterSpecEgressPolicyEgressToOperationArgs>> operations,
        @Nullable Output<List<String>> resources) {
        this.operations = operations;
        this.resources = resources;
    }

    private ServicePerimeterSpecEgressPolicyEgressToArgs() {
        this.operations = Codegen.empty();
        this.resources = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecEgressPolicyEgressToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServicePerimeterSpecEgressPolicyEgressToOperationArgs>> operations;
        private @Nullable Output<List<String>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecEgressPolicyEgressToArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
        }

        public Builder operations(@Nullable Output<List<ServicePerimeterSpecEgressPolicyEgressToOperationArgs>> operations) {
            this.operations = operations;
            return this;
        }
        public Builder operations(@Nullable List<ServicePerimeterSpecEgressPolicyEgressToOperationArgs> operations) {
            this.operations = Codegen.ofNullable(operations);
            return this;
        }
        public Builder operations(ServicePerimeterSpecEgressPolicyEgressToOperationArgs... operations) {
            return operations(List.of(operations));
        }
        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = Codegen.ofNullable(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }        public ServicePerimeterSpecEgressPolicyEgressToArgs build() {
            return new ServicePerimeterSpecEgressPolicyEgressToArgs(operations, resources);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.ApiOperationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the conditions under which an EgressPolicy matches a request. Conditions are based on information about the ApiOperation intended to be performed on the `resources` specified. Note that if the destination of the request is also protected by a ServicePerimeter, then that ServicePerimeter must have an IngressPolicy which allows access in order for this request to succeed. The request must match `operations` AND `resources` fields in order to be allowed egress out of the perimeter.
 * 
 */
public final class EgressToArgs extends com.pulumi.resources.ResourceArgs {

    public static final EgressToArgs Empty = new EgressToArgs();

    /**
     * A list of ApiOperations allowed to be performed by the sources specified in the corresponding EgressFrom. A request matches if it uses an operation/service in this list.
     * 
     */
    @Import(name="operations")
    private @Nullable Output<List<ApiOperationArgs>> operations;

    public Optional<Output<List<ApiOperationArgs>>> operations() {
        return Optional.ofNullable(this.operations);
    }

    /**
     * A list of resources, currently only projects in the form `projects/`, that are allowed to be accessed by sources defined in the corresponding EgressFrom. A request matches if it contains a resource in this list. If `*` is specified for `resources`, then this EgressTo rule will authorize access to all resources outside the perimeter.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    private EgressToArgs() {}

    private EgressToArgs(EgressToArgs $) {
        this.operations = $.operations;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EgressToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EgressToArgs $;

        public Builder() {
            $ = new EgressToArgs();
        }

        public Builder(EgressToArgs defaults) {
            $ = new EgressToArgs(Objects.requireNonNull(defaults));
        }

        public Builder operations(@Nullable Output<List<ApiOperationArgs>> operations) {
            $.operations = operations;
            return this;
        }

        public Builder operations(List<ApiOperationArgs> operations) {
            return operations(Output.of(operations));
        }

        public Builder operations(ApiOperationArgs... operations) {
            return operations(List.of(operations));
        }

        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        public EgressToArgs build() {
            return $;
        }
    }

}

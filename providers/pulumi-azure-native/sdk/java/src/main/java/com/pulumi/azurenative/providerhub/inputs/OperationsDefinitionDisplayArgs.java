// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Display information of the operation.
 * 
 */
public final class OperationsDefinitionDisplayArgs extends com.pulumi.resources.ResourceArgs {

    public static final OperationsDefinitionDisplayArgs Empty = new OperationsDefinitionDisplayArgs();

    @Import(name="description", required=true)
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }

    @Import(name="operation", required=true)
    private Output<String> operation;

    public Output<String> operation() {
        return this.operation;
    }

    @Import(name="provider", required=true)
    private Output<String> provider;

    public Output<String> provider() {
        return this.provider;
    }

    @Import(name="resource", required=true)
    private Output<String> resource;

    public Output<String> resource() {
        return this.resource;
    }

    private OperationsDefinitionDisplayArgs() {}

    private OperationsDefinitionDisplayArgs(OperationsDefinitionDisplayArgs $) {
        this.description = $.description;
        this.operation = $.operation;
        this.provider = $.provider;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OperationsDefinitionDisplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OperationsDefinitionDisplayArgs $;

        public Builder() {
            $ = new OperationsDefinitionDisplayArgs();
        }

        public Builder(OperationsDefinitionDisplayArgs defaults) {
            $ = new OperationsDefinitionDisplayArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder operation(Output<String> operation) {
            $.operation = operation;
            return this;
        }

        public Builder operation(String operation) {
            return operation(Output.of(operation));
        }

        public Builder provider(Output<String> provider) {
            $.provider = provider;
            return this;
        }

        public Builder provider(String provider) {
            return provider(Output.of(provider));
        }

        public Builder resource(Output<String> resource) {
            $.resource = resource;
            return this;
        }

        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public OperationsDefinitionDisplayArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.operation = Objects.requireNonNull($.operation, "expected parameter 'operation' to be non-null");
            $.provider = Objects.requireNonNull($.provider, "expected parameter 'provider' to be non-null");
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            return $;
        }
    }

}

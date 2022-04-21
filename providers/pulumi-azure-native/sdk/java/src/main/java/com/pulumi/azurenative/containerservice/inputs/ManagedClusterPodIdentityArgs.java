// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.inputs.UserAssignedIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedClusterPodIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedClusterPodIdentityArgs Empty = new ManagedClusterPodIdentityArgs();

    /**
     * Binding selector to use for the AzureIdentityBinding resource.
     * 
     */
    @Import(name="bindingSelector")
    private @Nullable Output<String> bindingSelector;

    public Optional<Output<String>> bindingSelector() {
        return Optional.ofNullable(this.bindingSelector);
    }

    /**
     * Information of the user assigned identity.
     * 
     */
    @Import(name="identity", required=true)
    private Output<UserAssignedIdentityArgs> identity;

    public Output<UserAssignedIdentityArgs> identity() {
        return this.identity;
    }

    /**
     * Name of the pod identity.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Namespace of the pod identity.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    private ManagedClusterPodIdentityArgs() {}

    private ManagedClusterPodIdentityArgs(ManagedClusterPodIdentityArgs $) {
        this.bindingSelector = $.bindingSelector;
        this.identity = $.identity;
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterPodIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterPodIdentityArgs $;

        public Builder() {
            $ = new ManagedClusterPodIdentityArgs();
        }

        public Builder(ManagedClusterPodIdentityArgs defaults) {
            $ = new ManagedClusterPodIdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder bindingSelector(@Nullable Output<String> bindingSelector) {
            $.bindingSelector = bindingSelector;
            return this;
        }

        public Builder bindingSelector(String bindingSelector) {
            return bindingSelector(Output.of(bindingSelector));
        }

        public Builder identity(Output<UserAssignedIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(UserAssignedIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public ManagedClusterPodIdentityArgs build() {
            $.identity = Objects.requireNonNull($.identity, "expected parameter 'identity' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.relay;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HybridConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HybridConnectionArgs Empty = new HybridConnectionArgs();

    /**
     * The hybrid connection name.
     * 
     */
    @Import(name="hybridConnectionName")
    private @Nullable Output<String> hybridConnectionName;

    public Optional<Output<String>> hybridConnectionName() {
        return Optional.ofNullable(this.hybridConnectionName);
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Returns true if client authorization is needed for this hybrid connection; otherwise, false.
     * 
     */
    @Import(name="requiresClientAuthorization")
    private @Nullable Output<Boolean> requiresClientAuthorization;

    public Optional<Output<Boolean>> requiresClientAuthorization() {
        return Optional.ofNullable(this.requiresClientAuthorization);
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The usermetadata is a placeholder to store user-defined string data for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their contact information. Also, user-defined configuration settings can be stored.
     * 
     */
    @Import(name="userMetadata")
    private @Nullable Output<String> userMetadata;

    public Optional<Output<String>> userMetadata() {
        return Optional.ofNullable(this.userMetadata);
    }

    private HybridConnectionArgs() {}

    private HybridConnectionArgs(HybridConnectionArgs $) {
        this.hybridConnectionName = $.hybridConnectionName;
        this.namespaceName = $.namespaceName;
        this.requiresClientAuthorization = $.requiresClientAuthorization;
        this.resourceGroupName = $.resourceGroupName;
        this.userMetadata = $.userMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HybridConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridConnectionArgs $;

        public Builder() {
            $ = new HybridConnectionArgs();
        }

        public Builder(HybridConnectionArgs defaults) {
            $ = new HybridConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder hybridConnectionName(@Nullable Output<String> hybridConnectionName) {
            $.hybridConnectionName = hybridConnectionName;
            return this;
        }

        public Builder hybridConnectionName(String hybridConnectionName) {
            return hybridConnectionName(Output.of(hybridConnectionName));
        }

        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        public Builder requiresClientAuthorization(@Nullable Output<Boolean> requiresClientAuthorization) {
            $.requiresClientAuthorization = requiresClientAuthorization;
            return this;
        }

        public Builder requiresClientAuthorization(Boolean requiresClientAuthorization) {
            return requiresClientAuthorization(Output.of(requiresClientAuthorization));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder userMetadata(@Nullable Output<String> userMetadata) {
            $.userMetadata = userMetadata;
            return this;
        }

        public Builder userMetadata(String userMetadata) {
            return userMetadata(Output.of(userMetadata));
        }

        public HybridConnectionArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}

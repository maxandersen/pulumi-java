// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.enums.IdentityManagementTypes;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesIdentityManagementArgs extends ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesIdentityManagementArgs Empty = new ResourceTypeRegistrationPropertiesIdentityManagementArgs();

    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    @Import(name="type")
    private @Nullable Output<Either<String,IdentityManagementTypes>> type;

    public Optional<Output<Either<String,IdentityManagementTypes>>> type() {
        return Optional.ofNullable(this.type);
    }

    private ResourceTypeRegistrationPropertiesIdentityManagementArgs() {}

    private ResourceTypeRegistrationPropertiesIdentityManagementArgs(ResourceTypeRegistrationPropertiesIdentityManagementArgs $) {
        this.applicationId = $.applicationId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceTypeRegistrationPropertiesIdentityManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceTypeRegistrationPropertiesIdentityManagementArgs $;

        public Builder() {
            $ = new ResourceTypeRegistrationPropertiesIdentityManagementArgs();
        }

        public Builder(ResourceTypeRegistrationPropertiesIdentityManagementArgs defaults) {
            $ = new ResourceTypeRegistrationPropertiesIdentityManagementArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        public Builder type(@Nullable Output<Either<String,IdentityManagementTypes>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,IdentityManagementTypes> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(IdentityManagementTypes type) {
            return type(Either.ofRight(type));
        }

        public ResourceTypeRegistrationPropertiesIdentityManagementArgs build() {
            return $;
        }
    }

}

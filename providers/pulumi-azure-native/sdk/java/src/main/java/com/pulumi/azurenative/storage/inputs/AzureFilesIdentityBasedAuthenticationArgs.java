// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.enums.DirectoryServiceOptions;
import com.pulumi.azurenative.storage.inputs.ActiveDirectoryPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for Azure Files identity based authentication.
 * 
 */
public final class AzureFilesIdentityBasedAuthenticationArgs extends ResourceArgs {

    public static final AzureFilesIdentityBasedAuthenticationArgs Empty = new AzureFilesIdentityBasedAuthenticationArgs();

    /**
     * Required if choose AD.
     * 
     */
    @Import(name="activeDirectoryProperties")
    private @Nullable Output<ActiveDirectoryPropertiesArgs> activeDirectoryProperties;

    /**
     * @return Required if choose AD.
     * 
     */
    public Optional<Output<ActiveDirectoryPropertiesArgs>> activeDirectoryProperties() {
        return Optional.ofNullable(this.activeDirectoryProperties);
    }

    /**
     * Indicates the directory service used.
     * 
     */
    @Import(name="directoryServiceOptions", required=true)
    private Output<Either<String,DirectoryServiceOptions>> directoryServiceOptions;

    /**
     * @return Indicates the directory service used.
     * 
     */
    public Output<Either<String,DirectoryServiceOptions>> directoryServiceOptions() {
        return this.directoryServiceOptions;
    }

    private AzureFilesIdentityBasedAuthenticationArgs() {}

    private AzureFilesIdentityBasedAuthenticationArgs(AzureFilesIdentityBasedAuthenticationArgs $) {
        this.activeDirectoryProperties = $.activeDirectoryProperties;
        this.directoryServiceOptions = $.directoryServiceOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFilesIdentityBasedAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFilesIdentityBasedAuthenticationArgs $;

        public Builder() {
            $ = new AzureFilesIdentityBasedAuthenticationArgs();
        }

        public Builder(AzureFilesIdentityBasedAuthenticationArgs defaults) {
            $ = new AzureFilesIdentityBasedAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeDirectoryProperties Required if choose AD.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryProperties(@Nullable Output<ActiveDirectoryPropertiesArgs> activeDirectoryProperties) {
            $.activeDirectoryProperties = activeDirectoryProperties;
            return this;
        }

        /**
         * @param activeDirectoryProperties Required if choose AD.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryProperties(ActiveDirectoryPropertiesArgs activeDirectoryProperties) {
            return activeDirectoryProperties(Output.of(activeDirectoryProperties));
        }

        /**
         * @param directoryServiceOptions Indicates the directory service used.
         * 
         * @return builder
         * 
         */
        public Builder directoryServiceOptions(Output<Either<String,DirectoryServiceOptions>> directoryServiceOptions) {
            $.directoryServiceOptions = directoryServiceOptions;
            return this;
        }

        /**
         * @param directoryServiceOptions Indicates the directory service used.
         * 
         * @return builder
         * 
         */
        public Builder directoryServiceOptions(Either<String,DirectoryServiceOptions> directoryServiceOptions) {
            return directoryServiceOptions(Output.of(directoryServiceOptions));
        }

        /**
         * @param directoryServiceOptions Indicates the directory service used.
         * 
         * @return builder
         * 
         */
        public Builder directoryServiceOptions(String directoryServiceOptions) {
            return directoryServiceOptions(Either.ofLeft(directoryServiceOptions));
        }

        /**
         * @param directoryServiceOptions Indicates the directory service used.
         * 
         * @return builder
         * 
         */
        public Builder directoryServiceOptions(DirectoryServiceOptions directoryServiceOptions) {
            return directoryServiceOptions(Either.ofRight(directoryServiceOptions));
        }

        public AzureFilesIdentityBasedAuthenticationArgs build() {
            $.directoryServiceOptions = Objects.requireNonNull($.directoryServiceOptions, "expected parameter 'directoryServiceOptions' to be non-null");
            return $;
        }
    }

}

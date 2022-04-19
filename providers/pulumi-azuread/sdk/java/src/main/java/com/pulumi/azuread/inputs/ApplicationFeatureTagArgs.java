// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationFeatureTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationFeatureTagArgs Empty = new ApplicationFeatureTagArgs();

    /**
     * Whether this application represents a custom SAML application for linked service principals. Enabling this will assign the `WindowsAzureActiveDirectoryCustomSingleSignOnApplication` tag. Defaults to `false`.
     * 
     */
    @Import(name="customSingleSignOn")
      private final @Nullable Output<Boolean> customSingleSignOn;

    public Output<Boolean> customSingleSignOn() {
        return this.customSingleSignOn == null ? Codegen.empty() : this.customSingleSignOn;
    }

    /**
     * Whether this application represents an Enterprise Application for linked service principals. Enabling this will assign the `WindowsAzureActiveDirectoryIntegratedApp` tag. Defaults to `false`.
     * 
     */
    @Import(name="enterprise")
      private final @Nullable Output<Boolean> enterprise;

    public Output<Boolean> enterprise() {
        return this.enterprise == null ? Codegen.empty() : this.enterprise;
    }

    /**
     * Whether this application represents a gallery application for linked service principals. Enabling this will assign the `WindowsAzureActiveDirectoryGalleryApplicationNonPrimaryV1` tag. Defaults to `false`.
     * 
     */
    @Import(name="gallery")
      private final @Nullable Output<Boolean> gallery;

    public Output<Boolean> gallery() {
        return this.gallery == null ? Codegen.empty() : this.gallery;
    }

    /**
     * Whether this app is invisible to users in My Apps and Office 365 Launcher. Enabling this will assign the `HideApp` tag. Defaults to `false`.
     * 
     */
    @Import(name="hide")
      private final @Nullable Output<Boolean> hide;

    public Output<Boolean> hide() {
        return this.hide == null ? Codegen.empty() : this.hide;
    }

    public ApplicationFeatureTagArgs(
        @Nullable Output<Boolean> customSingleSignOn,
        @Nullable Output<Boolean> enterprise,
        @Nullable Output<Boolean> gallery,
        @Nullable Output<Boolean> hide) {
        this.customSingleSignOn = customSingleSignOn;
        this.enterprise = enterprise;
        this.gallery = gallery;
        this.hide = hide;
    }

    private ApplicationFeatureTagArgs() {
        this.customSingleSignOn = Codegen.empty();
        this.enterprise = Codegen.empty();
        this.gallery = Codegen.empty();
        this.hide = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationFeatureTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> customSingleSignOn;
        private @Nullable Output<Boolean> enterprise;
        private @Nullable Output<Boolean> gallery;
        private @Nullable Output<Boolean> hide;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationFeatureTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSingleSignOn = defaults.customSingleSignOn;
    	      this.enterprise = defaults.enterprise;
    	      this.gallery = defaults.gallery;
    	      this.hide = defaults.hide;
        }

        public Builder customSingleSignOn(@Nullable Output<Boolean> customSingleSignOn) {
            this.customSingleSignOn = customSingleSignOn;
            return this;
        }
        public Builder customSingleSignOn(@Nullable Boolean customSingleSignOn) {
            this.customSingleSignOn = Codegen.ofNullable(customSingleSignOn);
            return this;
        }
        public Builder enterprise(@Nullable Output<Boolean> enterprise) {
            this.enterprise = enterprise;
            return this;
        }
        public Builder enterprise(@Nullable Boolean enterprise) {
            this.enterprise = Codegen.ofNullable(enterprise);
            return this;
        }
        public Builder gallery(@Nullable Output<Boolean> gallery) {
            this.gallery = gallery;
            return this;
        }
        public Builder gallery(@Nullable Boolean gallery) {
            this.gallery = Codegen.ofNullable(gallery);
            return this;
        }
        public Builder hide(@Nullable Output<Boolean> hide) {
            this.hide = hide;
            return this;
        }
        public Builder hide(@Nullable Boolean hide) {
            this.hide = Codegen.ofNullable(hide);
            return this;
        }        public ApplicationFeatureTagArgs build() {
            return new ApplicationFeatureTagArgs(customSingleSignOn, enterprise, gallery, hide);
        }
    }
}

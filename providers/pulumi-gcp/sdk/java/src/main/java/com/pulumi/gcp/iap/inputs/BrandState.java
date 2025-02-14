// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrandState extends com.pulumi.resources.ResourceArgs {

    public static final BrandState Empty = new BrandState();

    /**
     * Application name displayed on OAuth consent screen.
     * 
     */
    @Import(name="applicationTitle")
    private @Nullable Output<String> applicationTitle;

    /**
     * @return Application name displayed on OAuth consent screen.
     * 
     */
    public Optional<Output<String>> applicationTitle() {
        return Optional.ofNullable(this.applicationTitle);
    }

    /**
     * Output only. Identifier of the brand, in the format &#39;projects/{project_number}/brands/{brand_id}&#39;. NOTE: The brand
     * identification corresponds to the project number as only one brand per project can be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Output only. Identifier of the brand, in the format &#39;projects/{project_number}/brands/{brand_id}&#39;. NOTE: The brand
     * identification corresponds to the project number as only one brand per project can be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether the brand is only intended for usage inside the GSuite organization only.
     * 
     */
    @Import(name="orgInternalOnly")
    private @Nullable Output<Boolean> orgInternalOnly;

    /**
     * @return Whether the brand is only intended for usage inside the GSuite organization only.
     * 
     */
    public Optional<Output<Boolean>> orgInternalOnly() {
        return Optional.ofNullable(this.orgInternalOnly);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Support email displayed on the OAuth consent screen. Can be either a
     * user or group email. When a user email is specified, the caller must
     * be the user with the associated email address. When a group email is
     * specified, the caller can be either a user or a service account which
     * is an owner of the specified group in Cloud Identity.
     * 
     */
    @Import(name="supportEmail")
    private @Nullable Output<String> supportEmail;

    /**
     * @return Support email displayed on the OAuth consent screen. Can be either a
     * user or group email. When a user email is specified, the caller must
     * be the user with the associated email address. When a group email is
     * specified, the caller can be either a user or a service account which
     * is an owner of the specified group in Cloud Identity.
     * 
     */
    public Optional<Output<String>> supportEmail() {
        return Optional.ofNullable(this.supportEmail);
    }

    private BrandState() {}

    private BrandState(BrandState $) {
        this.applicationTitle = $.applicationTitle;
        this.name = $.name;
        this.orgInternalOnly = $.orgInternalOnly;
        this.project = $.project;
        this.supportEmail = $.supportEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrandState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrandState $;

        public Builder() {
            $ = new BrandState();
        }

        public Builder(BrandState defaults) {
            $ = new BrandState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationTitle Application name displayed on OAuth consent screen.
         * 
         * @return builder
         * 
         */
        public Builder applicationTitle(@Nullable Output<String> applicationTitle) {
            $.applicationTitle = applicationTitle;
            return this;
        }

        /**
         * @param applicationTitle Application name displayed on OAuth consent screen.
         * 
         * @return builder
         * 
         */
        public Builder applicationTitle(String applicationTitle) {
            return applicationTitle(Output.of(applicationTitle));
        }

        /**
         * @param name Output only. Identifier of the brand, in the format &#39;projects/{project_number}/brands/{brand_id}&#39;. NOTE: The brand
         * identification corresponds to the project number as only one brand per project can be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Output only. Identifier of the brand, in the format &#39;projects/{project_number}/brands/{brand_id}&#39;. NOTE: The brand
         * identification corresponds to the project number as only one brand per project can be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgInternalOnly Whether the brand is only intended for usage inside the GSuite organization only.
         * 
         * @return builder
         * 
         */
        public Builder orgInternalOnly(@Nullable Output<Boolean> orgInternalOnly) {
            $.orgInternalOnly = orgInternalOnly;
            return this;
        }

        /**
         * @param orgInternalOnly Whether the brand is only intended for usage inside the GSuite organization only.
         * 
         * @return builder
         * 
         */
        public Builder orgInternalOnly(Boolean orgInternalOnly) {
            return orgInternalOnly(Output.of(orgInternalOnly));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param supportEmail Support email displayed on the OAuth consent screen. Can be either a
         * user or group email. When a user email is specified, the caller must
         * be the user with the associated email address. When a group email is
         * specified, the caller can be either a user or a service account which
         * is an owner of the specified group in Cloud Identity.
         * 
         * @return builder
         * 
         */
        public Builder supportEmail(@Nullable Output<String> supportEmail) {
            $.supportEmail = supportEmail;
            return this;
        }

        /**
         * @param supportEmail Support email displayed on the OAuth consent screen. Can be either a
         * user or group email. When a user email is specified, the caller must
         * be the user with the associated email address. When a group email is
         * specified, the caller can be either a user or a service account which
         * is an owner of the specified group in Cloud Identity.
         * 
         * @return builder
         * 
         */
        public Builder supportEmail(String supportEmail) {
            return supportEmail(Output.of(supportEmail));
        }

        public BrandState build() {
            return $;
        }
    }

}

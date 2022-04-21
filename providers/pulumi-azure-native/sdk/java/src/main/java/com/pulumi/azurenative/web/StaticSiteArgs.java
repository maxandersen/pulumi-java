// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.enums.StagingEnvironmentPolicy;
import com.pulumi.azurenative.web.inputs.ManagedServiceIdentityArgs;
import com.pulumi.azurenative.web.inputs.SkuDescriptionArgs;
import com.pulumi.azurenative.web.inputs.StaticSiteBuildPropertiesArgs;
import com.pulumi.azurenative.web.inputs.StaticSiteTemplateOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StaticSiteArgs extends com.pulumi.resources.ResourceArgs {

    public static final StaticSiteArgs Empty = new StaticSiteArgs();

    /**
     * &lt;code&gt;false&lt;/code&gt; if config file is locked for this static web app; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Import(name="allowConfigFileUpdates")
    private @Nullable Output<Boolean> allowConfigFileUpdates;

    public Optional<Output<Boolean>> allowConfigFileUpdates() {
        return Optional.ofNullable(this.allowConfigFileUpdates);
    }

    /**
     * The target branch in the repository.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * Build properties to configure on the repository.
     * 
     */
    @Import(name="buildProperties")
    private @Nullable Output<StaticSiteBuildPropertiesArgs> buildProperties;

    public Optional<Output<StaticSiteBuildPropertiesArgs>> buildProperties() {
        return Optional.ofNullable(this.buildProperties);
    }

    /**
     * Managed service identity.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Optional<Output<ManagedServiceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Resource Location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the static site to create or update.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A user&#39;s github repository token. This is used to setup the Github Actions workflow file and API secrets.
     * 
     */
    @Import(name="repositoryToken")
    private @Nullable Output<String> repositoryToken;

    public Optional<Output<String>> repositoryToken() {
        return Optional.ofNullable(this.repositoryToken);
    }

    /**
     * URL for the repository of the static site.
     * 
     */
    @Import(name="repositoryUrl")
    private @Nullable Output<String> repositoryUrl;

    public Optional<Output<String>> repositoryUrl() {
        return Optional.ofNullable(this.repositoryUrl);
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Description of a SKU for a scalable resource.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuDescriptionArgs> sku;

    public Optional<Output<SkuDescriptionArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * State indicating whether staging environments are allowed or not allowed for a static web app.
     * 
     */
    @Import(name="stagingEnvironmentPolicy")
    private @Nullable Output<StagingEnvironmentPolicy> stagingEnvironmentPolicy;

    public Optional<Output<StagingEnvironmentPolicy>> stagingEnvironmentPolicy() {
        return Optional.ofNullable(this.stagingEnvironmentPolicy);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Template options for generating a new repository.
     * 
     */
    @Import(name="templateProperties")
    private @Nullable Output<StaticSiteTemplateOptionsArgs> templateProperties;

    public Optional<Output<StaticSiteTemplateOptionsArgs>> templateProperties() {
        return Optional.ofNullable(this.templateProperties);
    }

    private StaticSiteArgs() {}

    private StaticSiteArgs(StaticSiteArgs $) {
        this.allowConfigFileUpdates = $.allowConfigFileUpdates;
        this.branch = $.branch;
        this.buildProperties = $.buildProperties;
        this.identity = $.identity;
        this.kind = $.kind;
        this.location = $.location;
        this.name = $.name;
        this.repositoryToken = $.repositoryToken;
        this.repositoryUrl = $.repositoryUrl;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.stagingEnvironmentPolicy = $.stagingEnvironmentPolicy;
        this.tags = $.tags;
        this.templateProperties = $.templateProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticSiteArgs $;

        public Builder() {
            $ = new StaticSiteArgs();
        }

        public Builder(StaticSiteArgs defaults) {
            $ = new StaticSiteArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowConfigFileUpdates(@Nullable Output<Boolean> allowConfigFileUpdates) {
            $.allowConfigFileUpdates = allowConfigFileUpdates;
            return this;
        }

        public Builder allowConfigFileUpdates(Boolean allowConfigFileUpdates) {
            return allowConfigFileUpdates(Output.of(allowConfigFileUpdates));
        }

        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        public Builder buildProperties(@Nullable Output<StaticSiteBuildPropertiesArgs> buildProperties) {
            $.buildProperties = buildProperties;
            return this;
        }

        public Builder buildProperties(StaticSiteBuildPropertiesArgs buildProperties) {
            return buildProperties(Output.of(buildProperties));
        }

        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(ManagedServiceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder repositoryToken(@Nullable Output<String> repositoryToken) {
            $.repositoryToken = repositoryToken;
            return this;
        }

        public Builder repositoryToken(String repositoryToken) {
            return repositoryToken(Output.of(repositoryToken));
        }

        public Builder repositoryUrl(@Nullable Output<String> repositoryUrl) {
            $.repositoryUrl = repositoryUrl;
            return this;
        }

        public Builder repositoryUrl(String repositoryUrl) {
            return repositoryUrl(Output.of(repositoryUrl));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sku(@Nullable Output<SkuDescriptionArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SkuDescriptionArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder stagingEnvironmentPolicy(@Nullable Output<StagingEnvironmentPolicy> stagingEnvironmentPolicy) {
            $.stagingEnvironmentPolicy = stagingEnvironmentPolicy;
            return this;
        }

        public Builder stagingEnvironmentPolicy(StagingEnvironmentPolicy stagingEnvironmentPolicy) {
            return stagingEnvironmentPolicy(Output.of(stagingEnvironmentPolicy));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder templateProperties(@Nullable Output<StaticSiteTemplateOptionsArgs> templateProperties) {
            $.templateProperties = templateProperties;
            return this;
        }

        public Builder templateProperties(StaticSiteTemplateOptionsArgs templateProperties) {
            return templateProperties(Output.of(templateProperties));
        }

        public StaticSiteArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}

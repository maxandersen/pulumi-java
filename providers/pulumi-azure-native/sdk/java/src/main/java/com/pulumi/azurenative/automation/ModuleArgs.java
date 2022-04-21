// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.automation.inputs.ContentLinkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModuleArgs Empty = new ModuleArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the module content link.
     * 
     */
    @Import(name="contentLink", required=true)
    private Output<ContentLinkArgs> contentLink;

    public Output<ContentLinkArgs> contentLink() {
        return this.contentLink;
    }

    /**
     * Gets or sets the location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of module.
     * 
     */
    @Import(name="moduleName")
    private @Nullable Output<String> moduleName;

    public Optional<Output<String>> moduleName() {
        return Optional.ofNullable(this.moduleName);
    }

    /**
     * Gets or sets name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the tags attached to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ModuleArgs() {}

    private ModuleArgs(ModuleArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.contentLink = $.contentLink;
        this.location = $.location;
        this.moduleName = $.moduleName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModuleArgs $;

        public Builder() {
            $ = new ModuleArgs();
        }

        public Builder(ModuleArgs defaults) {
            $ = new ModuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        public Builder contentLink(Output<ContentLinkArgs> contentLink) {
            $.contentLink = contentLink;
            return this;
        }

        public Builder contentLink(ContentLinkArgs contentLink) {
            return contentLink(Output.of(contentLink));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder moduleName(@Nullable Output<String> moduleName) {
            $.moduleName = moduleName;
            return this;
        }

        public Builder moduleName(String moduleName) {
            return moduleName(Output.of(moduleName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ModuleArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.contentLink = Objects.requireNonNull($.contentLink, "expected parameter 'contentLink' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}

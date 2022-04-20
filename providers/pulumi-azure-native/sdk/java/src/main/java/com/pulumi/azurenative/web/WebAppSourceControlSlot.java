// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppSourceControlSlotArgs;
import com.pulumi.azurenative.web.outputs.GitHubActionConfigurationResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Source control configuration for an app.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppSourceControlSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/sourcecontrols/web 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppSourceControlSlot")
public class WebAppSourceControlSlot extends com.pulumi.resources.CustomResource {
    /**
     * Name of branch to use for deployment.
     * 
     */
    @Export(name="branch", type=String.class, parameters={})
    private Output</* @Nullable */ String> branch;

    /**
     * @return Name of branch to use for deployment.
     * 
     */
    public Output</* @Nullable */ String> branch() {
        return this.branch;
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; to enable deployment rollback; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Export(name="deploymentRollbackEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deploymentRollbackEnabled;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to enable deployment rollback; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Output</* @Nullable */ Boolean> deploymentRollbackEnabled() {
        return this.deploymentRollbackEnabled;
    }
    /**
     * If GitHub Action is selected, than the associated configuration.
     * 
     */
    @Export(name="gitHubActionConfiguration", type=GitHubActionConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ GitHubActionConfigurationResponse> gitHubActionConfiguration;

    /**
     * @return If GitHub Action is selected, than the associated configuration.
     * 
     */
    public Output</* @Nullable */ GitHubActionConfigurationResponse> gitHubActionConfiguration() {
        return this.gitHubActionConfiguration;
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; if this is deployed via GitHub action.
     * 
     */
    @Export(name="isGitHubAction", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isGitHubAction;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; if this is deployed via GitHub action.
     * 
     */
    public Output</* @Nullable */ Boolean> isGitHubAction() {
        return this.isGitHubAction;
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; to limit to manual integration; &lt;code&gt;false&lt;/code&gt; to enable continuous integration (which configures webhooks into online repos like GitHub).
     * 
     */
    @Export(name="isManualIntegration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isManualIntegration;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to limit to manual integration; &lt;code&gt;false&lt;/code&gt; to enable continuous integration (which configures webhooks into online repos like GitHub).
     * 
     */
    public Output</* @Nullable */ Boolean> isManualIntegration() {
        return this.isManualIntegration;
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; for a Mercurial repository; &lt;code&gt;false&lt;/code&gt; for a Git repository.
     * 
     */
    @Export(name="isMercurial", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isMercurial;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; for a Mercurial repository; &lt;code&gt;false&lt;/code&gt; for a Git repository.
     * 
     */
    public Output</* @Nullable */ Boolean> isMercurial() {
        return this.isMercurial;
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Repository or source control URL.
     * 
     */
    @Export(name="repoUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> repoUrl;

    /**
     * @return Repository or source control URL.
     * 
     */
    public Output</* @Nullable */ String> repoUrl() {
        return this.repoUrl;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppSourceControlSlot(String name) {
        this(name, WebAppSourceControlSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppSourceControlSlot(String name, WebAppSourceControlSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppSourceControlSlot(String name, WebAppSourceControlSlotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSourceControlSlot", name, args == null ? WebAppSourceControlSlotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppSourceControlSlot(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSourceControlSlot", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppSourceControlSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppSourceControlSlot").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WebAppSourceControlSlot get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppSourceControlSlot(name, id, options);
    }
}

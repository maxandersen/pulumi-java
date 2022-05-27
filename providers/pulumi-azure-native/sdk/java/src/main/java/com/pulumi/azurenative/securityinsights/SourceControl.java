// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.securityinsights.SourceControlArgs;
import com.pulumi.azurenative.securityinsights.outputs.RepositoryResponse;
import com.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a SourceControl in Azure Security Insights.
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * ### Creates a source control.
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var sourceControl = new SourceControl(&#34;sourceControl&#34;, SourceControlArgs.builder()        
 *             .contentTypes(            
 *                 &#34;AnalyticRules&#34;,
 *                 &#34;Workbook&#34;)
 *             .description(&#34;This is a source control&#34;)
 *             .displayName(&#34;My Source Control&#34;)
 *             .operationalInsightsResourceProvider(&#34;Microsoft.OperationalInsights&#34;)
 *             .repoType(&#34;Github&#34;)
 *             .repository(Map.ofEntries(
 *                 Map.entry(&#34;branch&#34;, &#34;master&#34;),
 *                 Map.entry(&#34;displayUrl&#34;, &#34;https://github.com/user/repo&#34;),
 *                 Map.entry(&#34;pathMapping&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;contentType&#34;, &#34;AnalyticRules&#34;),
 *                         Map.entry(&#34;path&#34;, &#34;path/to/rules&#34;)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;contentType&#34;, &#34;Workbook&#34;),
 *                         Map.entry(&#34;path&#34;, &#34;path/to/workbooks&#34;)
 *                     )),
 *                 Map.entry(&#34;url&#34;, &#34;https://github.com/user/repo&#34;)
 *             ))
 *             .resourceGroupName(&#34;myRg&#34;)
 *             .sourceControlId(&#34;789e0c1f-4a3d-43ad-809c-e713b677b04a&#34;)
 *             .workspaceName(&#34;myWorkspace&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:SourceControl 789e0c1f-4a3d-43ad-809c-e713b677b04a /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalIinsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/sourcecontrols/789e0c1f-4a3d-43ad-809c-e713b677b04a 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:SourceControl")
public class SourceControl extends com.pulumi.resources.CustomResource {
    /**
     * Array of source control content types.
     * 
     */
    @Export(name="contentTypes", type=List.class, parameters={String.class})
    private Output<List<String>> contentTypes;

    /**
     * @return Array of source control content types.
     * 
     */
    public Output<List<String>> contentTypes() {
        return this.contentTypes;
    }
    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdAt;

    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    public Output<Optional<String>> createdAt() {
        return Codegen.optional(this.createdAt);
    }
    /**
     * The identity that created the resource.
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdBy;

    /**
     * @return The identity that created the resource.
     * 
     */
    public Output<Optional<String>> createdBy() {
        return Codegen.optional(this.createdBy);
    }
    /**
     * The type of identity that created the resource.
     * 
     */
    @Export(name="createdByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdByType;

    /**
     * @return The type of identity that created the resource.
     * 
     */
    public Output<Optional<String>> createdByType() {
        return Codegen.optional(this.createdByType);
    }
    /**
     * A description of the source control
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the source control
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The display name of the source control
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the source control
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Etag of the azure resource
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @Export(name="lastModifiedAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedAt;

    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    public Output<Optional<String>> lastModifiedAt() {
        return Codegen.optional(this.lastModifiedAt);
    }
    /**
     * The identity that last modified the resource.
     * 
     */
    @Export(name="lastModifiedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedBy;

    /**
     * @return The identity that last modified the resource.
     * 
     */
    public Output<Optional<String>> lastModifiedBy() {
        return Codegen.optional(this.lastModifiedBy);
    }
    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Export(name="lastModifiedByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedByType;

    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    public Output<Optional<String>> lastModifiedByType() {
        return Codegen.optional(this.lastModifiedByType);
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The repository type of the source control
     * 
     */
    @Export(name="repoType", type=String.class, parameters={})
    private Output<String> repoType;

    /**
     * @return The repository type of the source control
     * 
     */
    public Output<String> repoType() {
        return this.repoType;
    }
    /**
     * Repository metadata.
     * 
     */
    @Export(name="repository", type=RepositoryResponse.class, parameters={})
    private Output<RepositoryResponse> repository;

    /**
     * @return Repository metadata.
     * 
     */
    public Output<RepositoryResponse> repository() {
        return this.repository;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SourceControl(String name) {
        this(name, SourceControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SourceControl(String name, SourceControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SourceControl(String name, SourceControlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:SourceControl", name, args == null ? SourceControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SourceControl(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:SourceControl", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210301preview:SourceControl").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:SourceControl").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20211001preview:SourceControl").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20220101preview:SourceControl").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20220401preview:SourceControl").build())
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
    public static SourceControl get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SourceControl(name, id, options);
    }
}

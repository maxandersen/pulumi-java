// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.deploymentmanager.ArtifactSourceArgs;
import com.pulumi.azurenative.deploymentmanager.outputs.SasAuthenticationResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The resource that defines the source location where the artifacts are located.
 * API Version: 2019-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:deploymentmanager:ArtifactSource myArtifactSource /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/artifactSources/{artifactSourceName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:deploymentmanager:ArtifactSource")
public class ArtifactSource extends com.pulumi.resources.CustomResource {
    /**
     * The path from the location that the &#39;authentication&#39; property [say, a SAS URI to the blob container] refers to, to the location of the artifacts. This can be used to differentiate different versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced by the authentication property concatenated with this optional artifactRoot path forms the artifact source location where the artifacts are expected to be found.
     * 
     */
    @Export(name="artifactRoot", type=String.class, parameters={})
    private Output</* @Nullable */ String> artifactRoot;

    /**
     * @return The path from the location that the &#39;authentication&#39; property [say, a SAS URI to the blob container] refers to, to the location of the artifacts. This can be used to differentiate different versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced by the authentication property concatenated with this optional artifactRoot path forms the artifact source location where the artifacts are expected to be found.
     * 
     */
    public Output</* @Nullable */ String> artifactRoot() {
        return this.artifactRoot;
    }
    /**
     * The authentication method to use to access the artifact source.
     * 
     */
    @Export(name="authentication", type=SasAuthenticationResponse.class, parameters={})
    private Output<SasAuthenticationResponse> authentication;

    /**
     * @return The authentication method to use to access the artifact source.
     * 
     */
    public Output<SasAuthenticationResponse> authentication() {
        return this.authentication;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of artifact source used.
     * 
     */
    @Export(name="sourceType", type=String.class, parameters={})
    private Output<String> sourceType;

    /**
     * @return The type of artifact source used.
     * 
     */
    public Output<String> sourceType() {
        return this.sourceType;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ArtifactSource(String name) {
        this(name, ArtifactSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ArtifactSource(String name, ArtifactSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ArtifactSource(String name, ArtifactSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:deploymentmanager:ArtifactSource", name, args == null ? ArtifactSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ArtifactSource(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:deploymentmanager:ArtifactSource", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:deploymentmanager/v20180901preview:ArtifactSource").build()),
                Output.of(Alias.builder().type("azure-native:deploymentmanager/v20191101preview:ArtifactSource").build())
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
    public static ArtifactSource get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ArtifactSource(name, id, options);
    }
}

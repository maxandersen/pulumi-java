// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.certificatemanager_v1.CertificateMapArgs;
import com.pulumi.googlenative.certificatemanager_v1.outputs.GclbTargetResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new CertificateMap in a given project and location.
 * 
 */
@ResourceType(type="google-native:certificatemanager/v1:CertificateMap")
public class CertificateMap extends com.pulumi.resources.CustomResource {
    /**
     * The creation timestamp of a Certificate Map.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation timestamp of a Certificate Map.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * One or more paragraphs of text description of a certificate map.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return One or more paragraphs of text description of a certificate map.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A list of GCLB targets which use this Certificate Map.
     * 
     */
    @Export(name="gclbTargets", type=List.class, parameters={GclbTargetResponse.class})
    private Output<List<GclbTargetResponse>> gclbTargets;

    /**
     * @return A list of GCLB targets which use this Certificate Map.
     * 
     */
    public Output<List<GclbTargetResponse>> gclbTargets() {
        return this.gclbTargets;
    }
    /**
     * Set of labels associated with a Certificate Map.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Set of labels associated with a Certificate Map.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * A user-defined name of the Certificate Map. Certificate Map names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificateMaps/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-defined name of the Certificate Map. Certificate Map names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificateMaps/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The update timestamp of a Certificate Map.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The update timestamp of a Certificate Map.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateMap(String name) {
        this(name, CertificateMapArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateMap(String name, CertificateMapArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateMap(String name, CertificateMapArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:certificatemanager/v1:CertificateMap", name, args == null ? CertificateMapArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateMap(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:certificatemanager/v1:CertificateMap", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static CertificateMap get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertificateMap(name, id, options);
    }
}

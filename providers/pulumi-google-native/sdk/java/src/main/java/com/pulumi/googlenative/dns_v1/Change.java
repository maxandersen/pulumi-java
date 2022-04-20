// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dns_v1.ChangeArgs;
import com.pulumi.googlenative.dns_v1.outputs.ResourceRecordSetResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Atomically updates the ResourceRecordSet collection.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:dns/v1:Change")
public class Change extends com.pulumi.resources.CustomResource {
    /**
     * Which ResourceRecordSets to add?
     * 
     */
    @Export(name="additions", type=List.class, parameters={ResourceRecordSetResponse.class})
    private Output<List<ResourceRecordSetResponse>> additions;

    /**
     * @return Which ResourceRecordSets to add?
     * 
     */
    public Output<List<ResourceRecordSetResponse>> additions() {
        return this.additions;
    }
    /**
     * Which ResourceRecordSets to remove? Must match existing data exactly.
     * 
     */
    @Export(name="deletions", type=List.class, parameters={ResourceRecordSetResponse.class})
    private Output<List<ResourceRecordSetResponse>> deletions;

    /**
     * @return Which ResourceRecordSets to remove? Must match existing data exactly.
     * 
     */
    public Output<List<ResourceRecordSetResponse>> deletions() {
        return this.deletions;
    }
    /**
     * If the DNS queries for the zone will be served.
     * 
     */
    @Export(name="isServing", type=Boolean.class, parameters={})
    private Output<Boolean> isServing;

    /**
     * @return If the DNS queries for the zone will be served.
     * 
     */
    public Output<Boolean> isServing() {
        return this.isServing;
    }
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The time that this operation was started by the server (output only). This is in RFC3339 text format.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return The time that this operation was started by the server (output only). This is in RFC3339 text format.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }
    /**
     * Status of the operation (output only). A status of &#34;done&#34; means that the request to update the authoritative servers has been sent, but the servers might not be updated yet.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the operation (output only). A status of &#34;done&#34; means that the request to update the authoritative servers has been sent, but the servers might not be updated yet.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Change(String name) {
        this(name, ChangeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Change(String name, ChangeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Change(String name, ChangeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1:Change", name, args == null ? ChangeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Change(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1:Change", name, null, makeResourceOptions(options, id));
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
    public static Change get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Change(name, id, options);
    }
}

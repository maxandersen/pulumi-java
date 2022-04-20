// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.healthcare_v1.ConsentArgs;
import com.pulumi.googlenative.healthcare_v1.outputs.GoogleCloudHealthcareV1ConsentPolicyResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Consent in the parent consent store.
 * 
 */
@ResourceType(type="google-native:healthcare/v1:Consent")
public class Consent extends com.pulumi.resources.CustomResource {
    /**
     * The resource name of the Consent artifact that contains proof of the end user&#39;s consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
     */
    @Export(name="consentArtifact", type=String.class, parameters={})
    private Output<String> consentArtifact;

    /**
     * @return The resource name of the Consent artifact that contains proof of the end user&#39;s consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
     */
    public Output<String> consentArtifact() {
        return this.consentArtifact;
    }
    /**
     * Timestamp in UTC of when this Consent is considered expired.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return Timestamp in UTC of when this Consent is considered expired.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
     */
    public Output<Map<String,String>> metadata() {
        return this.metadata;
    }
    /**
     * Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Optional. Represents a user&#39;s consent in terms of the resources that can be accessed and under what conditions.
     * 
     */
    @Export(name="policies", type=List.class, parameters={GoogleCloudHealthcareV1ConsentPolicyResponse.class})
    private Output<List<GoogleCloudHealthcareV1ConsentPolicyResponse>> policies;

    /**
     * @return Optional. Represents a user&#39;s consent in terms of the resources that can be accessed and under what conditions.
     * 
     */
    public Output<List<GoogleCloudHealthcareV1ConsentPolicyResponse>> policies() {
        return this.policies;
    }
    /**
     * The timestamp that the revision was created.
     * 
     */
    @Export(name="revisionCreateTime", type=String.class, parameters={})
    private Output<String> revisionCreateTime;

    /**
     * @return The timestamp that the revision was created.
     * 
     */
    public Output<String> revisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * The revision ID of the Consent. The format is an 8-character hexadecimal string. Refer to a specific revision of a Consent by appending `@{revision_id}` to the Consent&#39;s resource name.
     * 
     */
    @Export(name="revisionId", type=String.class, parameters={})
    private Output<String> revisionId;

    /**
     * @return The revision ID of the Consent. The format is an 8-character hexadecimal string. Refer to a specific revision of a Consent by appending `@{revision_id}` to the Consent&#39;s resource name.
     * 
     */
    public Output<String> revisionId() {
        return this.revisionId;
    }
    /**
     * Indicates the current state of this Consent.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Indicates the current state of this Consent.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Input only. The time to live for this Consent from when it is created.
     * 
     */
    @Export(name="ttl", type=String.class, parameters={})
    private Output<String> ttl;

    /**
     * @return Input only. The time to live for this Consent from when it is created.
     * 
     */
    public Output<String> ttl() {
        return this.ttl;
    }
    /**
     * User&#39;s UUID provided by the client.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return User&#39;s UUID provided by the client.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Consent(String name) {
        this(name, ConsentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Consent(String name, ConsentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Consent(String name, ConsentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:Consent", name, args == null ? ConsentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Consent(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:Consent", name, null, makeResourceOptions(options, id));
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
    public static Consent get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Consent(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.privateca_v1.CertificateAuthorityArgs;
import com.pulumi.googlenative.privateca_v1.outputs.AccessUrlsResponse;
import com.pulumi.googlenative.privateca_v1.outputs.CertificateConfigResponse;
import com.pulumi.googlenative.privateca_v1.outputs.CertificateDescriptionResponse;
import com.pulumi.googlenative.privateca_v1.outputs.KeyVersionSpecResponse;
import com.pulumi.googlenative.privateca_v1.outputs.SubordinateConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create a new CertificateAuthority in a given Project and Location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:privateca/v1:CertificateAuthority")
public class CertificateAuthority extends com.pulumi.resources.CustomResource {
    /**
     * URLs for accessing content published by this CA, such as the CA certificate and CRLs.
     * 
     */
    @Export(name="accessUrls", type=AccessUrlsResponse.class, parameters={})
    private Output<AccessUrlsResponse> accessUrls;

    /**
     * @return URLs for accessing content published by this CA, such as the CA certificate and CRLs.
     * 
     */
    public Output<AccessUrlsResponse> accessUrls() {
        return this.accessUrls;
    }
    /**
     * A structured description of this CertificateAuthority's CA certificate and its issuers. Ordered as self-to-root.
     * 
     */
    @Export(name="caCertificateDescriptions", type=List.class, parameters={CertificateDescriptionResponse.class})
    private Output<List<CertificateDescriptionResponse>> caCertificateDescriptions;

    /**
     * @return A structured description of this CertificateAuthority's CA certificate and its issuers. Ordered as self-to-root.
     * 
     */
    public Output<List<CertificateDescriptionResponse>> caCertificateDescriptions() {
        return this.caCertificateDescriptions;
    }
    /**
     * Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
     */
    @Export(name="config", type=CertificateConfigResponse.class, parameters={})
    private Output<CertificateConfigResponse> config;

    /**
     * @return Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
     */
    public Output<CertificateConfigResponse> config() {
        return this.config;
    }
    /**
     * The time at which this CertificateAuthority was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which this CertificateAuthority was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The time at which this CertificateAuthority was soft deleted, if it is in the DELETED state.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return The time at which this CertificateAuthority was soft deleted, if it is in the DELETED state.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * The time at which this CertificateAuthority will be permanently purged, if it is in the DELETED state.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return The time at which this CertificateAuthority will be permanently purged, if it is in the DELETED state.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
     */
    @Export(name="gcsBucket", type=String.class, parameters={})
    private Output<String> gcsBucket;

    /**
     * @return Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
     */
    public Output<String> gcsBucket() {
        return this.gcsBucket;
    }
    /**
     * Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
     */
    @Export(name="keySpec", type=KeyVersionSpecResponse.class, parameters={})
    private Output<KeyVersionSpecResponse> keySpec;

    /**
     * @return Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
     */
    public Output<KeyVersionSpecResponse> keySpec() {
        return this.keySpec;
    }
    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels with user-defined metadata.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Immutable. The desired lifetime of the CA certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate.
     * 
     */
    @Export(name="lifetime", type=String.class, parameters={})
    private Output<String> lifetime;

    /**
     * @return Immutable. The desired lifetime of the CA certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate.
     * 
     */
    public Output<String> lifetime() {
        return this.lifetime;
    }
    /**
     * The resource name for this CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * This CertificateAuthority's certificate chain, including the current CertificateAuthority's certificate. Ordered such that the root issuer is the final element (consistent with RFC 5246). For a self-signed CA, this will only list the current CertificateAuthority's certificate.
     * 
     */
    @Export(name="pemCaCertificates", type=List.class, parameters={String.class})
    private Output<List<String>> pemCaCertificates;

    /**
     * @return This CertificateAuthority's certificate chain, including the current CertificateAuthority's certificate. Ordered such that the root issuer is the final element (consistent with RFC 5246). For a self-signed CA, this will only list the current CertificateAuthority's certificate.
     * 
     */
    public Output<List<String>> pemCaCertificates() {
        return this.pemCaCertificates;
    }
    /**
     * The State for this CertificateAuthority.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The State for this CertificateAuthority.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
     */
    @Export(name="subordinateConfig", type=SubordinateConfigResponse.class, parameters={})
    private Output<SubordinateConfigResponse> subordinateConfig;

    /**
     * @return Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
     */
    public Output<SubordinateConfigResponse> subordinateConfig() {
        return this.subordinateConfig;
    }
    /**
     * The CaPool.Tier of the CaPool that includes this CertificateAuthority.
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return The CaPool.Tier of the CaPool that includes this CertificateAuthority.
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }
    /**
     * Immutable. The Type of this CertificateAuthority.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Immutable. The Type of this CertificateAuthority.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The time at which this CertificateAuthority was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time at which this CertificateAuthority was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateAuthority(String name) {
        this(name, CertificateAuthorityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateAuthority(String name, CertificateAuthorityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateAuthority(String name, CertificateAuthorityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:CertificateAuthority", name, args == null ? CertificateAuthorityArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateAuthority(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:CertificateAuthority", name, null, makeResourceOptions(options, id));
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
    public static CertificateAuthority get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertificateAuthority(name, id, options);
    }
}

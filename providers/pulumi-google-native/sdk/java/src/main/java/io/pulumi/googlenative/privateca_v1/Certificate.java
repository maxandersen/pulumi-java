// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.privateca_v1.CertificateArgs;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateConfigResponse;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateDescriptionResponse;
import io.pulumi.googlenative.privateca_v1.outputs.RevocationDetailsResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create a new Certificate in a given Project, Location from a particular CaPool.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:privateca/v1:Certificate")
public class Certificate extends io.pulumi.resources.CustomResource {
    /**
     * A structured description of the issued X.509 certificate.
     * 
     */
    @Export(name="certificateDescription", type=CertificateDescriptionResponse.class, parameters={})
    private Output<CertificateDescriptionResponse> certificateDescription;

    /**
     * @return A structured description of the issued X.509 certificate.
     * 
     */
    public Output<CertificateDescriptionResponse> certificateDescription() {
        return this.certificateDescription;
    }
    /**
     * Immutable. The resource name for a CertificateTemplate used to issue this certificate, in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`. If this is specified, the caller must have the necessary permission to use this template. If this is omitted, no template will be used. This template must be in the same location as the Certificate.
     * 
     */
    @Export(name="certificateTemplate", type=String.class, parameters={})
    private Output<String> certificateTemplate;

    /**
     * @return Immutable. The resource name for a CertificateTemplate used to issue this certificate, in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`. If this is specified, the caller must have the necessary permission to use this template. If this is omitted, no template will be used. This template must be in the same location as the Certificate.
     * 
     */
    public Output<String> certificateTemplate() {
        return this.certificateTemplate;
    }
    /**
     * Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
     * 
     */
    @Export(name="config", type=CertificateConfigResponse.class, parameters={})
    private Output<CertificateConfigResponse> config;

    /**
     * @return Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
     * 
     */
    public Output<CertificateConfigResponse> config() {
        return this.config;
    }
    /**
     * The time at which this Certificate was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which this Certificate was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The resource name of the issuing CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
     */
    @Export(name="issuerCertificateAuthority", type=String.class, parameters={})
    private Output<String> issuerCertificateAuthority;

    /**
     * @return The resource name of the issuing CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
     */
    public Output<String> issuerCertificateAuthority() {
        return this.issuerCertificateAuthority;
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
     * Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
     * 
     */
    @Export(name="lifetime", type=String.class, parameters={})
    private Output<String> lifetime;

    /**
     * @return Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
     * 
     */
    public Output<String> lifetime() {
        return this.lifetime;
    }
    /**
     * The resource name for this Certificate in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificates/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this Certificate in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificates/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The pem-encoded, signed X.509 certificate.
     * 
     */
    @Export(name="pemCertificate", type=String.class, parameters={})
    private Output<String> pemCertificate;

    /**
     * @return The pem-encoded, signed X.509 certificate.
     * 
     */
    public Output<String> pemCertificate() {
        return this.pemCertificate;
    }
    /**
     * The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246.
     * 
     */
    @Export(name="pemCertificateChain", type=List.class, parameters={String.class})
    private Output<List<String>> pemCertificateChain;

    /**
     * @return The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246.
     * 
     */
    public Output<List<String>> pemCertificateChain() {
        return this.pemCertificateChain;
    }
    /**
     * Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    @Export(name="pemCsr", type=String.class, parameters={})
    private Output<String> pemCsr;

    /**
     * @return Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    public Output<String> pemCsr() {
        return this.pemCsr;
    }
    /**
     * Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present.
     * 
     */
    @Export(name="revocationDetails", type=RevocationDetailsResponse.class, parameters={})
    private Output<RevocationDetailsResponse> revocationDetails;

    /**
     * @return Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present.
     * 
     */
    public Output<RevocationDetailsResponse> revocationDetails() {
        return this.revocationDetails;
    }
    /**
     * Immutable. Specifies how the Certificate's identity fields are to be decided. If this is omitted, the `DEFAULT` subject mode will be used.
     * 
     */
    @Export(name="subjectMode", type=String.class, parameters={})
    private Output<String> subjectMode;

    /**
     * @return Immutable. Specifies how the Certificate's identity fields are to be decided. If this is omitted, the `DEFAULT` subject mode will be used.
     * 
     */
    public Output<String> subjectMode() {
        return this.subjectMode;
    }
    /**
     * The time at which this Certificate was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time at which this Certificate was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:Certificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Certificate get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, options);
    }
}

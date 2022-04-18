// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.certificateauthority.CertificateArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateState;
import com.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescription;
import com.pulumi.gcp.certificateauthority.outputs.CertificateConfig;
import com.pulumi.gcp.certificateauthority.outputs.CertificateRevocationDetail;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Certificate corresponds to a signed X.509 certificate issued by a Certificate.
 * 
 * > **Note:** The Certificate Authority that is referenced by this resource **must** be
 * `tier = "ENTERPRISE"`
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Certificate can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/certificate:Certificate default projects/{{project}}/locations/{{location}}/caPools/{{pool}}/certificates/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/certificate:Certificate default {{project}}/{{location}}/{{pool}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/certificate:Certificate default {{location}}/{{pool}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:certificateauthority/certificate:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    /**
     * Certificate Authority name.
     * 
     */
    @Export(name="certificateAuthority", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateAuthority;

    /**
     * @return Certificate Authority name.
     * 
     */
    public Output</* @Nullable */ String> certificateAuthority() {
        return this.certificateAuthority;
    }
    /**
     * Output only. Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if
     * this field is present.
     * 
     */
    @Export(name="certificateDescriptions", type=List.class, parameters={CertificateCertificateDescription.class})
    private Output<List<CertificateCertificateDescription>> certificateDescriptions;

    /**
     * @return Output only. Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if
     * this field is present.
     * 
     */
    public Output<List<CertificateCertificateDescription>> certificateDescriptions() {
        return this.certificateDescriptions;
    }
    /**
     * The resource name for a CertificateTemplate used to issue this certificate,
     * in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`. If this is specified,
     * the caller must have the necessary permission to use this template. If this is
     * omitted, no template will be used. This template must be in the same location
     * as the Certificate.
     * 
     */
    @Export(name="certificateTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateTemplate;

    /**
     * @return The resource name for a CertificateTemplate used to issue this certificate,
     * in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`. If this is specified,
     * the caller must have the necessary permission to use this template. If this is
     * omitted, no template will be used. This template must be in the same location
     * as the Certificate.
     * 
     */
    public Output</* @Nullable */ String> certificateTemplate() {
        return this.certificateTemplate;
    }
    /**
     * The config used to create a self-signed X.509 certificate or CSR.
     * Structure is documented below.
     * 
     */
    @Export(name="config", type=CertificateConfig.class, parameters={})
    private Output</* @Nullable */ CertificateConfig> config;

    /**
     * @return The config used to create a self-signed X.509 certificate or CSR.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ CertificateConfig> config() {
        return this.config;
    }
    /**
     * The time that this resource was created on the server. This is in RFC3339 text format.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time that this resource was created on the server. This is in RFC3339 text format.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Labels with user-defined metadata to apply to this resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels with user-defined metadata to apply to this resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The desired lifetime of the CA certificate. Used to create the "notBeforeTime" and
     * "notAfterTime" fields inside an X.509 certificate. A duration in seconds with up to nine
     * fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Export(name="lifetime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lifetime;

    /**
     * @return The desired lifetime of the CA certificate. Used to create the "notBeforeTime" and
     * "notAfterTime" fields inside an X.509 certificate. A duration in seconds with up to nine
     * fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Output</* @Nullable */ String> lifetime() {
        return this.lifetime;
    }
    /**
     * Location of the Certificate. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the Certificate. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name for this Certificate.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for this Certificate.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Output only. The pem-encoded, signed X.509 certificate.
     * 
     */
    @Export(name="pemCertificate", type=String.class, parameters={})
    private Output<String> pemCertificate;

    /**
     * @return Output only. The pem-encoded, signed X.509 certificate.
     * 
     */
    public Output<String> pemCertificate() {
        return this.pemCertificate;
    }
    /**
     * Required. Expected to be in leaf-to-root order according to RFC 5246.
     * 
     */
    @Export(name="pemCertificates", type=List.class, parameters={String.class})
    private Output<List<String>> pemCertificates;

    /**
     * @return Required. Expected to be in leaf-to-root order according to RFC 5246.
     * 
     */
    public Output<List<String>> pemCertificates() {
        return this.pemCertificates;
    }
    /**
     * Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    @Export(name="pemCsr", type=String.class, parameters={})
    private Output</* @Nullable */ String> pemCsr;

    /**
     * @return Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    public Output</* @Nullable */ String> pemCsr() {
        return this.pemCsr;
    }
    /**
     * The name of the CaPool this Certificate belongs to.
     * 
     */
    @Export(name="pool", type=String.class, parameters={})
    private Output<String> pool;

    /**
     * @return The name of the CaPool this Certificate belongs to.
     * 
     */
    public Output<String> pool() {
        return this.pool;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Output only. Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if
     * this field is present.
     * 
     */
    @Export(name="revocationDetails", type=List.class, parameters={CertificateRevocationDetail.class})
    private Output<List<CertificateRevocationDetail>> revocationDetails;

    /**
     * @return Output only. Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if
     * this field is present.
     * 
     */
    public Output<List<CertificateRevocationDetail>> revocationDetails() {
        return this.revocationDetails;
    }
    /**
     * Output only. The time at which this CertificateAuthority was updated. This is in RFC3339 text format.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. The time at which this CertificateAuthority was updated. This is in RFC3339 text format.
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
    public Certificate(String name, CertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/certificate:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/certificate:Certificate", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Certificate get(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, state, options);
    }
}

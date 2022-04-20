// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.privateca_v1.CertificateTemplateArgs;
import com.pulumi.googlenative.privateca_v1.outputs.CertificateExtensionConstraintsResponse;
import com.pulumi.googlenative.privateca_v1.outputs.CertificateIdentityConstraintsResponse;
import com.pulumi.googlenative.privateca_v1.outputs.X509ParametersResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create a new CertificateTemplate in a given Project and Location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:privateca/v1:CertificateTemplate")
public class CertificateTemplate extends com.pulumi.resources.CustomResource {
    /**
     * The time at which this CertificateTemplate was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which this CertificateTemplate was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. A human-readable description of scenarios this template is intended for.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A human-readable description of scenarios this template is intended for.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate&#39;s identity.
     * 
     */
    @Export(name="identityConstraints", type=CertificateIdentityConstraintsResponse.class, parameters={})
    private Output<CertificateIdentityConstraintsResponse> identityConstraints;

    /**
     * @return Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate&#39;s identity.
     * 
     */
    public Output<CertificateIdentityConstraintsResponse> identityConstraints() {
        return this.identityConstraints;
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
     * The resource name for this CertificateTemplate in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this CertificateTemplate in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don&#39;t appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool&#39;s IssuancePolicy defines baseline_values that don&#39;t appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate&#39;s X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate&#39;s predefined_values.
     * 
     */
    @Export(name="passthroughExtensions", type=CertificateExtensionConstraintsResponse.class, parameters={})
    private Output<CertificateExtensionConstraintsResponse> passthroughExtensions;

    /**
     * @return Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don&#39;t appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool&#39;s IssuancePolicy defines baseline_values that don&#39;t appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate&#39;s X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate&#39;s predefined_values.
     * 
     */
    public Output<CertificateExtensionConstraintsResponse> passthroughExtensions() {
        return this.passthroughExtensions;
    }
    /**
     * Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool&#39;s IssuancePolicy defines conflicting baseline_values for the same properties, the certificate issuance request will fail.
     * 
     */
    @Export(name="predefinedValues", type=X509ParametersResponse.class, parameters={})
    private Output<X509ParametersResponse> predefinedValues;

    /**
     * @return Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool&#39;s IssuancePolicy defines conflicting baseline_values for the same properties, the certificate issuance request will fail.
     * 
     */
    public Output<X509ParametersResponse> predefinedValues() {
        return this.predefinedValues;
    }
    /**
     * The time at which this CertificateTemplate was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time at which this CertificateTemplate was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateTemplate(String name) {
        this(name, CertificateTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateTemplate(String name, CertificateTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateTemplate(String name, CertificateTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:CertificateTemplate", name, args == null ? CertificateTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateTemplate(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:CertificateTemplate", name, null, makeResourceOptions(options, id));
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
    public static CertificateTemplate get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertificateTemplate(name, id, options);
    }
}

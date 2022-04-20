// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.MangedSslCertificateArgs;
import com.pulumi.gcp.compute.inputs.MangedSslCertificateState;
import com.pulumi.gcp.compute.outputs.MangedSslCertificateManaged;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * @deprecated
 * gcp.compute.MangedSslCertificate has been deprecated in favor of gcp.compute.ManagedSslCertificate
 * 
 */
@Deprecated /* gcp.compute.MangedSslCertificate has been deprecated in favor of gcp.compute.ManagedSslCertificate */
@ResourceType(type="gcp:compute/mangedSslCertificate:MangedSslCertificate")
public class MangedSslCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The unique identifier for the resource.
     * 
     */
    @Export(name="certificateId", type=Integer.class, parameters={})
    private Output<Integer> certificateId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Output<Integer> certificateId() {
        return this.certificateId;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Expire time of the certificate.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return Expire time of the certificate.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * Properties relevant to a managed certificate. These will be used if the certificate is managed (as indicated by a value
     * of &#39;MANAGED&#39; in &#39;type&#39;).
     * 
     */
    @Export(name="managed", type=MangedSslCertificateManaged.class, parameters={})
    private Output</* @Nullable */ MangedSslCertificateManaged> managed;

    /**
     * @return Properties relevant to a managed certificate. These will be used if the certificate is managed (as indicated by a value
     * of &#39;MANAGED&#39; in &#39;type&#39;).
     * 
     */
    public Output</* @Nullable */ MangedSslCertificateManaged> managed() {
        return this.managed;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
     * &#39;[a-z]([-a-z0-9]*[a-z0-9])?&#39; which means the first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. These are in the same
     * namespace as the managed SSL certificates.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
     * &#39;[a-z]([-a-z0-9]*[a-z0-9])?&#39; which means the first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. These are in the same
     * namespace as the managed SSL certificates.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    @Export(name="subjectAlternativeNames", type=List.class, parameters={String.class})
    private Output<List<String>> subjectAlternativeNames;

    /**
     * @return Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    public Output<List<String>> subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }
    /**
     * Enum field whose value is always &#39;MANAGED&#39; - used to signal to the API which type this is. Default value: &#34;MANAGED&#34;
     * Possible values: [&#34;MANAGED&#34;]
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Enum field whose value is always &#39;MANAGED&#39; - used to signal to the API which type this is. Default value: &#34;MANAGED&#34;
     * Possible values: [&#34;MANAGED&#34;]
     * 
     */
    public Output</* @Nullable */ String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MangedSslCertificate(String name) {
        this(name, MangedSslCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MangedSslCertificate(String name, @Nullable MangedSslCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MangedSslCertificate(String name, @Nullable MangedSslCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/mangedSslCertificate:MangedSslCertificate", name, args == null ? MangedSslCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MangedSslCertificate(String name, Output<String> id, @Nullable MangedSslCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/mangedSslCertificate:MangedSslCertificate", name, state, makeResourceOptions(options, id));
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
    public static MangedSslCertificate get(String name, Output<String> id, @Nullable MangedSslCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MangedSslCertificate(name, id, state, options);
    }
}

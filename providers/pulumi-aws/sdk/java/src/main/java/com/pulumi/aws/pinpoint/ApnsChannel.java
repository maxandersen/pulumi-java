// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.pinpoint.ApnsChannelArgs;
import com.pulumi.aws.pinpoint.inputs.ApnsChannelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Pinpoint APNs Channel resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Pinpoint APNs Channel can be imported using the `application-id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:pinpoint/apnsChannel:ApnsChannel apns application-id
 * ```
 * 
 */
@ResourceType(type="aws:pinpoint/apnsChannel:ApnsChannel")
public class ApnsChannel extends com.pulumi.resources.CustomResource {
    /**
     * The application ID.
     * 
     */
    @Export(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The application ID.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
     * 
     */
    @Export(name="bundleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> bundleId;

    /**
     * @return The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
     * 
     */
    public Output</* @Nullable */ String> bundleId() {
        return this.bundleId;
    }
    /**
     * The pem encoded TLS Certificate from Apple.
     * 
     */
    @Export(name="certificate", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificate;

    /**
     * @return The pem encoded TLS Certificate from Apple.
     * 
     */
    public Output</* @Nullable */ String> certificate() {
        return this.certificate;
    }
    /**
     * The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn&#39;t attempt to use the other authentication type.
     * 
     */
    @Export(name="defaultAuthenticationMethod", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultAuthenticationMethod;

    /**
     * @return The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn&#39;t attempt to use the other authentication type.
     * 
     */
    public Output</* @Nullable */ String> defaultAuthenticationMethod() {
        return this.defaultAuthenticationMethod;
    }
    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The Certificate Private Key file (ie. `.key` file).
     * 
     */
    @Export(name="privateKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateKey;

    /**
     * @return The Certificate Private Key file (ie. `.key` file).
     * 
     */
    public Output</* @Nullable */ String> privateKey() {
        return this.privateKey;
    }
    /**
     * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     * 
     */
    @Export(name="teamId", type=String.class, parameters={})
    private Output</* @Nullable */ String> teamId;

    /**
     * @return The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     * 
     */
    public Output</* @Nullable */ String> teamId() {
        return this.teamId;
    }
    /**
     * The `.p8` file that you download from your Apple developer account when you create an authentication key.
     * 
     */
    @Export(name="tokenKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenKey;

    /**
     * @return The `.p8` file that you download from your Apple developer account when you create an authentication key.
     * 
     */
    public Output</* @Nullable */ String> tokenKey() {
        return this.tokenKey;
    }
    /**
     * The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
     * 
     */
    @Export(name="tokenKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenKeyId;

    /**
     * @return The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
     * 
     */
    public Output</* @Nullable */ String> tokenKeyId() {
        return this.tokenKeyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApnsChannel(String name) {
        this(name, ApnsChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApnsChannel(String name, ApnsChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApnsChannel(String name, ApnsChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/apnsChannel:ApnsChannel", name, args == null ? ApnsChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApnsChannel(String name, Output<String> id, @Nullable ApnsChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/apnsChannel:ApnsChannel", name, state, makeResourceOptions(options, id));
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
    public static ApnsChannel get(String name, Output<String> id, @Nullable ApnsChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApnsChannel(name, id, state, options);
    }
}

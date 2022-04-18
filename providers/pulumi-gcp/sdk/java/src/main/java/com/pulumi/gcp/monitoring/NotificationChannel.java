// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.monitoring.NotificationChannelArgs;
import com.pulumi.gcp.monitoring.inputs.NotificationChannelState;
import com.pulumi.gcp.monitoring.outputs.NotificationChannelSensitiveLabels;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A NotificationChannel is a medium through which an alert is delivered
 * when a policy violation is detected. Examples of channels include email, SMS,
 * and third-party messaging applications. Fields containing sensitive information
 * like authentication tokens or contact info are only partially populated on retrieval.
 * 
 * Notification Channels are designed to be flexible and are made up of a supported `type`
 * and labels to configure that channel. Each `type` has specific labels that need to be
 * present for that channel to be correctly configured. The labels that are required to be
 * present for one channel `type` are often different than those required for another.
 * Due to these loose constraints it's often best to set up a channel through the UI
 * and import it to the provider when setting up a brand new channel type to determine which
 * labels are required.
 * 
 * A list of supported channels per project the `list` endpoint can be
 * accessed programmatically or through the api explorer at  https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list .
 * This provides the channel type and all of the required labels that must be passed.
 * 
 * To get more information about NotificationChannel, see:
 * 
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
 * * How-to Guides
 *     * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
 *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * NotificationChannel can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:monitoring/notificationChannel:NotificationChannel default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:monitoring/notificationChannel:NotificationChannel")
public class NotificationChannel extends com.pulumi.resources.CustomResource {
    /**
     * An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
     * 
     */
    public Output</* @Nullable */ String> displayName() {
        return this.displayName;
    }
    /**
     * Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
     * 
     */
    public Output</* @Nullable */ Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Configuration fields that define the channel and its behavior. The
     * permissible and required labels are specified in the
     * NotificationChannelDescriptor corresponding to the type field.
     * Labels with sensitive data are obfuscated by the API and therefore the provider cannot
     * determine if there are upstream changes to these fields. They can also be configured via
     * the sensitive_labels block, but cannot be configured in both places.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Configuration fields that define the channel and its behavior. The
     * permissible and required labels are specified in the
     * NotificationChannelDescriptor corresponding to the type field.
     * Labels with sensitive data are obfuscated by the API and therefore the provider cannot
     * determine if there are upstream changes to these fields. They can also be configured via
     * the sensitive_labels block, but cannot be configured in both places.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The full REST resource name for this channel. The syntax is: projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The
     * [CHANNEL_ID] is automatically assigned by the server on creation.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The full REST resource name for this channel. The syntax is: projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The
     * [CHANNEL_ID] is automatically assigned by the server on creation.
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Different notification type behaviors are configured primarily using the the `labels` field on this
     * resource. This block contains the labels which contain secrets or passwords so that they can be marked
     * sensitive and hidden from plan output. The name of the field, eg: password, will be the key
     * in the `labels` map in the api request.
     * Credentials may not be specified in both locations and will cause an error. Changing from one location
     * to a different credential configuration in the config will require an apply to update state.
     * Structure is documented below.
     * 
     */
    @Export(name="sensitiveLabels", type=NotificationChannelSensitiveLabels.class, parameters={})
    private Output</* @Nullable */ NotificationChannelSensitiveLabels> sensitiveLabels;

    /**
     * @return Different notification type behaviors are configured primarily using the the `labels` field on this
     * resource. This block contains the labels which contain secrets or passwords so that they can be marked
     * sensitive and hidden from plan output. The name of the field, eg: password, will be the key
     * in the `labels` map in the api request.
     * Credentials may not be specified in both locations and will cause an error. Changing from one location
     * to a different credential configuration in the config will require an apply to update state.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ NotificationChannelSensitiveLabels> sensitiveLabels() {
        return this.sensitiveLabels;
    }
    /**
     * The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as "email", "slack", etc...
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as "email", "slack", etc...
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    @Export(name="userLabels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> userLabels;

    /**
     * @return User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> userLabels() {
        return this.userLabels;
    }
    /**
     * Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel
     * operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is
     * non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel
     * works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require
     * verification or that this specific channel has been exempted from verification because it was created prior to
     * verification being required for channels of this type.This field cannot be modified using a standard
     * UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
     * 
     */
    @Export(name="verificationStatus", type=String.class, parameters={})
    private Output<String> verificationStatus;

    /**
     * @return Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel
     * operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is
     * non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel
     * works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require
     * verification or that this specific channel has been exempted from verification because it was created prior to
     * verification being required for channels of this type.This field cannot be modified using a standard
     * UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
     * 
     */
    public Output<String> verificationStatus() {
        return this.verificationStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationChannel(String name) {
        this(name, NotificationChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationChannel(String name, NotificationChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationChannel(String name, NotificationChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/notificationChannel:NotificationChannel", name, args == null ? NotificationChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationChannel(String name, Output<String> id, @Nullable NotificationChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/notificationChannel:NotificationChannel", name, state, makeResourceOptions(options, id));
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
    public static NotificationChannel get(String name, Output<String> id, @Nullable NotificationChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationChannel(name, id, state, options);
    }
}

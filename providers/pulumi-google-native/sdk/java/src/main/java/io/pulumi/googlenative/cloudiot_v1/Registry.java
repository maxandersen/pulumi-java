// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudiot_v1.RegistryArgs;
import io.pulumi.googlenative.cloudiot_v1.outputs.EventNotificationConfigResponse;
import io.pulumi.googlenative.cloudiot_v1.outputs.HttpConfigResponse;
import io.pulumi.googlenative.cloudiot_v1.outputs.MqttConfigResponse;
import io.pulumi.googlenative.cloudiot_v1.outputs.RegistryCredentialResponse;
import io.pulumi.googlenative.cloudiot_v1.outputs.StateNotificationConfigResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a device registry that contains devices.
 * 
 */
@ResourceType(type="google-native:cloudiot/v1:Registry")
public class Registry extends io.pulumi.resources.CustomResource {
    /**
     * The credentials used to verify the device credentials. No more than 10 credentials can be bound to a single registry at a time. The verification process occurs at the time of device creation or update. If this field is empty, no verification is performed. Otherwise, the credentials of a newly created device or added credentials of an updated device should be signed with one of these registry credentials. Note, however, that existing devices will never be affected by modifications to this list of credentials: after a device has been successfully created in a registry, it should be able to connect even if its registry credentials are revoked, deleted, or modified.
     * 
     */
    @Export(name="credentials", type=List.class, parameters={RegistryCredentialResponse.class})
    private Output<List<RegistryCredentialResponse>> credentials;

    /**
     * @return The credentials used to verify the device credentials. No more than 10 credentials can be bound to a single registry at a time. The verification process occurs at the time of device creation or update. If this field is empty, no verification is performed. Otherwise, the credentials of a newly created device or added credentials of an updated device should be signed with one of these registry credentials. Note, however, that existing devices will never be affected by modifications to this list of credentials: after a device has been successfully created in a registry, it should be able to connect even if its registry credentials are revoked, deleted, or modified.
     * 
     */
    public Output<List<RegistryCredentialResponse>> credentials() {
        return this.credentials;
    }
    /**
     * The configuration for notification of telemetry events received from the device. All telemetry events that were successfully published by the device and acknowledged by Cloud IoT Core are guaranteed to be delivered to Cloud Pub/Sub. If multiple configurations match a message, only the first matching configuration is used. If you try to publish a device telemetry event using MQTT without specifying a Cloud Pub/Sub topic for the device's registry, the connection closes automatically. If you try to do so using an HTTP connection, an error is returned. Up to 10 configurations may be provided.
     * 
     */
    @Export(name="eventNotificationConfigs", type=List.class, parameters={EventNotificationConfigResponse.class})
    private Output<List<EventNotificationConfigResponse>> eventNotificationConfigs;

    /**
     * @return The configuration for notification of telemetry events received from the device. All telemetry events that were successfully published by the device and acknowledged by Cloud IoT Core are guaranteed to be delivered to Cloud Pub/Sub. If multiple configurations match a message, only the first matching configuration is used. If you try to publish a device telemetry event using MQTT without specifying a Cloud Pub/Sub topic for the device's registry, the connection closes automatically. If you try to do so using an HTTP connection, an error is returned. Up to 10 configurations may be provided.
     * 
     */
    public Output<List<EventNotificationConfigResponse>> eventNotificationConfigs() {
        return this.eventNotificationConfigs;
    }
    /**
     * The DeviceService (HTTP) configuration for this device registry.
     * 
     */
    @Export(name="httpConfig", type=HttpConfigResponse.class, parameters={})
    private Output<HttpConfigResponse> httpConfig;

    /**
     * @return The DeviceService (HTTP) configuration for this device registry.
     * 
     */
    public Output<HttpConfigResponse> httpConfig() {
        return this.httpConfig;
    }
    /**
     * **Beta Feature** The default logging verbosity for activity from devices in this registry. The verbosity level can be overridden by Device.log_level.
     * 
     */
    @Export(name="logLevel", type=String.class, parameters={})
    private Output<String> logLevel;

    /**
     * @return **Beta Feature** The default logging verbosity for activity from devices in this registry. The verbosity level can be overridden by Device.log_level.
     * 
     */
    public Output<String> logLevel() {
        return this.logLevel;
    }
    /**
     * The MQTT configuration for this device registry.
     * 
     */
    @Export(name="mqttConfig", type=MqttConfigResponse.class, parameters={})
    private Output<MqttConfigResponse> mqttConfig;

    /**
     * @return The MQTT configuration for this device registry.
     * 
     */
    public Output<MqttConfigResponse> mqttConfig() {
        return this.mqttConfig;
    }
    /**
     * The resource path name. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource path name. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The configuration for notification of new states received from the device. State updates are guaranteed to be stored in the state history, but notifications to Cloud Pub/Sub are not guaranteed. For example, if permissions are misconfigured or the specified topic doesn't exist, no notification will be published but the state will still be stored in Cloud IoT Core.
     * 
     */
    @Export(name="stateNotificationConfig", type=StateNotificationConfigResponse.class, parameters={})
    private Output<StateNotificationConfigResponse> stateNotificationConfig;

    /**
     * @return The configuration for notification of new states received from the device. State updates are guaranteed to be stored in the state history, but notifications to Cloud Pub/Sub are not guaranteed. For example, if permissions are misconfigured or the specified topic doesn't exist, no notification will be published but the state will still be stored in Cloud IoT Core.
     * 
     */
    public Output<StateNotificationConfigResponse> stateNotificationConfig() {
        return this.stateNotificationConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Registry(String name) {
        this(name, RegistryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Registry(String name, @Nullable RegistryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Registry(String name, @Nullable RegistryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudiot/v1:Registry", name, args == null ? RegistryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Registry(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudiot/v1:Registry", name, null, makeResourceOptions(options, id));
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
    public static Registry get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Registry(name, id, options);
    }
}

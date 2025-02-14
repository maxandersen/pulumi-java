// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.lightsail.AlarmArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Lightsail::Alarm
 * 
 */
@ResourceType(type="aws-native:lightsail:Alarm")
public class Alarm extends com.pulumi.resources.CustomResource {
    @Export(name="alarmArn", type=String.class, parameters={})
    private Output<String> alarmArn;

    public Output<String> alarmArn() {
        return this.alarmArn;
    }
    /**
     * The name for the alarm. Specify the name of an existing alarm to update, and overwrite the previous configuration of the alarm.
     * 
     */
    @Export(name="alarmName", type=String.class, parameters={})
    private Output<String> alarmName;

    /**
     * @return The name for the alarm. Specify the name of an existing alarm to update, and overwrite the previous configuration of the alarm.
     * 
     */
    public Output<String> alarmName() {
        return this.alarmName;
    }
    /**
     * The arithmetic operation to use when comparing the specified statistic to the threshold. The specified statistic value is used as the first operand.
     * 
     */
    @Export(name="comparisonOperator", type=String.class, parameters={})
    private Output<String> comparisonOperator;

    /**
     * @return The arithmetic operation to use when comparing the specified statistic to the threshold. The specified statistic value is used as the first operand.
     * 
     */
    public Output<String> comparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * The contact protocols to use for the alarm, such as Email, SMS (text messaging), or both.
     * 
     */
    @Export(name="contactProtocols", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> contactProtocols;

    /**
     * @return The contact protocols to use for the alarm, such as Email, SMS (text messaging), or both.
     * 
     */
    public Output<Optional<List<String>>> contactProtocols() {
        return Codegen.optional(this.contactProtocols);
    }
    /**
     * The number of data points that must be not within the specified threshold to trigger the alarm. If you are setting an &#34;M out of N&#34; alarm, this value (datapointsToAlarm) is the M.
     * 
     */
    @Export(name="datapointsToAlarm", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> datapointsToAlarm;

    /**
     * @return The number of data points that must be not within the specified threshold to trigger the alarm. If you are setting an &#34;M out of N&#34; alarm, this value (datapointsToAlarm) is the M.
     * 
     */
    public Output<Optional<Integer>> datapointsToAlarm() {
        return Codegen.optional(this.datapointsToAlarm);
    }
    /**
     * The number of most recent periods over which data is compared to the specified threshold. If you are setting an &#34;M out of N&#34; alarm, this value (evaluationPeriods) is the N.
     * 
     */
    @Export(name="evaluationPeriods", type=Integer.class, parameters={})
    private Output<Integer> evaluationPeriods;

    /**
     * @return The number of most recent periods over which data is compared to the specified threshold. If you are setting an &#34;M out of N&#34; alarm, this value (evaluationPeriods) is the N.
     * 
     */
    public Output<Integer> evaluationPeriods() {
        return this.evaluationPeriods;
    }
    /**
     * The name of the metric to associate with the alarm.
     * 
     */
    @Export(name="metricName", type=String.class, parameters={})
    private Output<String> metricName;

    /**
     * @return The name of the metric to associate with the alarm.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }
    /**
     * The validation status of the SSL/TLS certificate.
     * 
     */
    @Export(name="monitoredResourceName", type=String.class, parameters={})
    private Output<String> monitoredResourceName;

    /**
     * @return The validation status of the SSL/TLS certificate.
     * 
     */
    public Output<String> monitoredResourceName() {
        return this.monitoredResourceName;
    }
    /**
     * Indicates whether the alarm is enabled. Notifications are enabled by default if you don&#39;t specify this parameter.
     * 
     */
    @Export(name="notificationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> notificationEnabled;

    /**
     * @return Indicates whether the alarm is enabled. Notifications are enabled by default if you don&#39;t specify this parameter.
     * 
     */
    public Output<Optional<Boolean>> notificationEnabled() {
        return Codegen.optional(this.notificationEnabled);
    }
    /**
     * The alarm states that trigger a notification.
     * 
     */
    @Export(name="notificationTriggers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> notificationTriggers;

    /**
     * @return The alarm states that trigger a notification.
     * 
     */
    public Output<Optional<List<String>>> notificationTriggers() {
        return Codegen.optional(this.notificationTriggers);
    }
    /**
     * The current state of the alarm.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the alarm.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The value against which the specified statistic is compared.
     * 
     */
    @Export(name="threshold", type=Double.class, parameters={})
    private Output<Double> threshold;

    /**
     * @return The value against which the specified statistic is compared.
     * 
     */
    public Output<Double> threshold() {
        return this.threshold;
    }
    /**
     * Sets how this alarm will handle missing data points.
     * 
     */
    @Export(name="treatMissingData", type=String.class, parameters={})
    private Output</* @Nullable */ String> treatMissingData;

    /**
     * @return Sets how this alarm will handle missing data points.
     * 
     */
    public Output<Optional<String>> treatMissingData() {
        return Codegen.optional(this.treatMissingData);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alarm(String name) {
        this(name, AlarmArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alarm(String name, AlarmArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alarm(String name, AlarmArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:Alarm", name, args == null ? AlarmArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Alarm(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:Alarm", name, null, makeResourceOptions(options, id));
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
    public static Alarm get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Alarm(name, id, options);
    }
}

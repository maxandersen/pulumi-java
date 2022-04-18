// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudwatch;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.cloudwatch.CompositeAlarmArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::CloudWatch::CompositeAlarm type specifies an alarm which aggregates the states of other Alarms (Metric or Composite Alarms) as defined by the AlarmRule expression
 * 
 */
@ResourceType(type="aws-native:cloudwatch:CompositeAlarm")
public class CompositeAlarm extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     * 
     */
    @Export(name="actionsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> actionsEnabled;

    /**
     * @return Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     * 
     */
    public Output</* @Nullable */ Boolean> actionsEnabled() {
        return this.actionsEnabled;
    }
    /**
     * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Specify each action as an Amazon Resource Name (ARN).
     * 
     */
    @Export(name="alarmActions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> alarmActions;

    /**
     * @return The list of actions to execute when this alarm transitions into an ALARM state from any other state. Specify each action as an Amazon Resource Name (ARN).
     * 
     */
    public Output</* @Nullable */ List<String>> alarmActions() {
        return this.alarmActions;
    }
    /**
     * The description of the alarm
     * 
     */
    @Export(name="alarmDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> alarmDescription;

    /**
     * @return The description of the alarm
     * 
     */
    public Output</* @Nullable */ String> alarmDescription() {
        return this.alarmDescription;
    }
    /**
     * The name of the Composite Alarm
     * 
     */
    @Export(name="alarmName", type=String.class, parameters={})
    private Output<String> alarmName;

    /**
     * @return The name of the Composite Alarm
     * 
     */
    public Output<String> alarmName() {
        return this.alarmName;
    }
    /**
     * Expression which aggregates the state of other Alarms (Metric or Composite Alarms)
     * 
     */
    @Export(name="alarmRule", type=String.class, parameters={})
    private Output<String> alarmRule;

    /**
     * @return Expression which aggregates the state of other Alarms (Metric or Composite Alarms)
     * 
     */
    public Output<String> alarmRule() {
        return this.alarmRule;
    }
    /**
     * Amazon Resource Name (ARN) of the alarm
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the alarm
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @Export(name="insufficientDataActions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> insufficientDataActions;

    /**
     * @return The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    public Output</* @Nullable */ List<String>> insufficientDataActions() {
        return this.insufficientDataActions;
    }
    /**
     * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @Export(name="oKActions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> oKActions;

    /**
     * @return The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    public Output</* @Nullable */ List<String>> oKActions() {
        return this.oKActions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CompositeAlarm(String name) {
        this(name, CompositeAlarmArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CompositeAlarm(String name, CompositeAlarmArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CompositeAlarm(String name, CompositeAlarmArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudwatch:CompositeAlarm", name, args == null ? CompositeAlarmArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CompositeAlarm(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudwatch:CompositeAlarm", name, null, makeResourceOptions(options, id));
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
    public static CompositeAlarm get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CompositeAlarm(name, id, options);
    }
}

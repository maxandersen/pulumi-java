// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codestarnotifications;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.codestarnotifications.NotificationRuleArgs;
import com.pulumi.awsnative.codestarnotifications.enums.NotificationRuleDetailType;
import com.pulumi.awsnative.codestarnotifications.enums.NotificationRuleStatus;
import com.pulumi.awsnative.codestarnotifications.outputs.NotificationRuleTarget;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::CodeStarNotifications::NotificationRule
 * 
 */
@ResourceType(type="aws-native:codestarnotifications:NotificationRule")
public class NotificationRule extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="createdBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdBy;

    public Output<Optional<String>> createdBy() {
        return Codegen.optional(this.createdBy);
    }
    @Export(name="detailType", type=NotificationRuleDetailType.class, parameters={})
    private Output<NotificationRuleDetailType> detailType;

    public Output<NotificationRuleDetailType> detailType() {
        return this.detailType;
    }
    @Export(name="eventTypeId", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventTypeId;

    public Output<Optional<String>> eventTypeId() {
        return Codegen.optional(this.eventTypeId);
    }
    @Export(name="eventTypeIds", type=List.class, parameters={String.class})
    private Output<List<String>> eventTypeIds;

    public Output<List<String>> eventTypeIds() {
        return this.eventTypeIds;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="resource", type=String.class, parameters={})
    private Output<String> resource;

    public Output<String> resource() {
        return this.resource;
    }
    @Export(name="status", type=NotificationRuleStatus.class, parameters={})
    private Output</* @Nullable */ NotificationRuleStatus> status;

    public Output<Optional<NotificationRuleStatus>> status() {
        return Codegen.optional(this.status);
    }
    @Export(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    public Output<Optional<Object>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="targetAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetAddress;

    public Output<Optional<String>> targetAddress() {
        return Codegen.optional(this.targetAddress);
    }
    @Export(name="targets", type=List.class, parameters={NotificationRuleTarget.class})
    private Output<List<NotificationRuleTarget>> targets;

    public Output<List<NotificationRuleTarget>> targets() {
        return this.targets;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationRule(String name) {
        this(name, NotificationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationRule(String name, NotificationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationRule(String name, NotificationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codestarnotifications:NotificationRule", name, args == null ? NotificationRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codestarnotifications:NotificationRule", name, null, makeResourceOptions(options, id));
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
    public static NotificationRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationRule(name, id, options);
    }
}

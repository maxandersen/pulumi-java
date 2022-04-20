// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmcontacts;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ssmcontacts.ContactChannelArgs;
import com.pulumi.awsnative.ssmcontacts.enums.ContactChannelChannelType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SSMContacts::ContactChannel
 * 
 */
@ResourceType(type="aws-native:ssmcontacts:ContactChannel")
public class ContactChannel extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The details that SSM Incident Manager uses when trying to engage the contact channel.
     * 
     */
    @Export(name="channelAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> channelAddress;

    /**
     * @return The details that SSM Incident Manager uses when trying to engage the contact channel.
     * 
     */
    public Output</* @Nullable */ String> channelAddress() {
        return this.channelAddress;
    }
    /**
     * The device name. String of 6 to 50 alphabetical, numeric, dash, and underscore characters.
     * 
     */
    @Export(name="channelName", type=String.class, parameters={})
    private Output</* @Nullable */ String> channelName;

    /**
     * @return The device name. String of 6 to 50 alphabetical, numeric, dash, and underscore characters.
     * 
     */
    public Output</* @Nullable */ String> channelName() {
        return this.channelName;
    }
    /**
     * Device type, which specify notification channel. Currently supported values: “SMS”, “VOICE”, “EMAIL”, “CHATBOT.
     * 
     */
    @Export(name="channelType", type=ContactChannelChannelType.class, parameters={})
    private Output</* @Nullable */ ContactChannelChannelType> channelType;

    /**
     * @return Device type, which specify notification channel. Currently supported values: “SMS”, “VOICE”, “EMAIL”, “CHATBOT.
     * 
     */
    public Output</* @Nullable */ ContactChannelChannelType> channelType() {
        return this.channelType;
    }
    /**
     * ARN of the contact resource
     * 
     */
    @Export(name="contactId", type=String.class, parameters={})
    private Output</* @Nullable */ String> contactId;

    /**
     * @return ARN of the contact resource
     * 
     */
    public Output</* @Nullable */ String> contactId() {
        return this.contactId;
    }
    /**
     * If you want to activate the channel at a later time, you can choose to defer activation. SSM Incident Manager can&#39;t engage your contact channel until it has been activated.
     * 
     */
    @Export(name="deferActivation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deferActivation;

    /**
     * @return If you want to activate the channel at a later time, you can choose to defer activation. SSM Incident Manager can&#39;t engage your contact channel until it has been activated.
     * 
     */
    public Output</* @Nullable */ Boolean> deferActivation() {
        return this.deferActivation;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContactChannel(String name) {
        this(name, ContactChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContactChannel(String name, @Nullable ContactChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContactChannel(String name, @Nullable ContactChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssmcontacts:ContactChannel", name, args == null ? ContactChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContactChannel(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssmcontacts:ContactChannel", name, null, makeResourceOptions(options, id));
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
    public static ContactChannel get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContactChannel(name, id, options);
    }
}

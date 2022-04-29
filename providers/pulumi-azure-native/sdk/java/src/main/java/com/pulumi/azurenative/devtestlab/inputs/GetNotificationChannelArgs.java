// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNotificationChannelArgs extends InvokeArgs {

    public static final GetNotificationChannelArgs Empty = new GetNotificationChannelArgs();

    /**
     * Specify the $expand query. Example: &#39;properties($select=webHookUrl)&#39;
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return Specify the $expand query. Example: &#39;properties($select=webHookUrl)&#39;
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
    private String labName;

    /**
     * @return The name of the lab.
     * 
     */
    public String labName() {
        return this.labName;
    }

    /**
     * The name of the notification channel.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the notification channel.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNotificationChannelArgs() {}

    private GetNotificationChannelArgs(GetNotificationChannelArgs $) {
        this.expand = $.expand;
        this.labName = $.labName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotificationChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotificationChannelArgs $;

        public Builder() {
            $ = new GetNotificationChannelArgs();
        }

        public Builder(GetNotificationChannelArgs defaults) {
            $ = new GetNotificationChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand Specify the $expand query. Example: &#39;properties($select=webHookUrl)&#39;
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(String labName) {
            $.labName = labName;
            return this;
        }

        /**
         * @param name The name of the notification channel.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetNotificationChannelArgs build() {
            $.labName = Objects.requireNonNull($.labName, "expected parameter 'labName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}

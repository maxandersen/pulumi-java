// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devopsguru.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNotificationChannelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotificationChannelArgs Empty = new GetNotificationChannelArgs();

    /**
     * The ID of a notification channel.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetNotificationChannelArgs() {}

    private GetNotificationChannelArgs(GetNotificationChannelArgs $) {
        this.id = $.id;
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

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetNotificationChannelArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}

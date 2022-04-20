// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7StoreNotificationConfigsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final Hl7StoreNotificationConfigsGetArgs Empty = new Hl7StoreNotificationConfigsGetArgs();

    /**
     * Restricts notifications sent for messages matching a filter. If this is empty, all messages
     * are matched. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings
     * Fields/functions available for filtering are:
     * * messageType, from the MSH-9.1 field. For example, NOT messageType = &#34;ADT&#34;.
     * * send_date or sendDate, the YYYY-MM-DD date the message was sent in the dataset&#39;s timeZone, from the MSH-7 segment. For example, send_date &lt; &#34;2017-01-02&#34;.
     * * sendTime, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example, sendTime &lt; &#34;2017-01-02T00:00:00-05:00&#34;.
     * * sendFacility, the care center that the message came from, from the MSH-4 segment. For example, sendFacility = &#34;ABC&#34;.
     * * PatientId(value, type), which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example, PatientId(&#34;123456&#34;, &#34;MRN&#34;).
     * * labels.x, a string value of the label with key x as set using the Message.labels map. For example, labels.&#34;priority&#34;=&#34;high&#34;. The operator :* can be used to assert the existence of a label. For example, labels.&#34;priority&#34;:*.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * The Cloud Pub/Sub topic that notifications of changes are published on. Supplied by the client.
     * PubsubMessage.Data will contain the resource name. PubsubMessage.MessageId is the ID of this message.
     * It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message
     * was published. Notifications are only sent if the topic is non-empty. Topic names must be scoped to a
     * project. service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com must have publisher permissions on the given
     * Cloud Pub/Sub topic. Not having adequate permissions will cause the calls that send notifications to fail.
     * 
     */
    @Import(name="pubsubTopic", required=true)
      private final Output<String> pubsubTopic;

    public Output<String> pubsubTopic() {
        return this.pubsubTopic;
    }

    public Hl7StoreNotificationConfigsGetArgs(
        @Nullable Output<String> filter,
        Output<String> pubsubTopic) {
        this.filter = filter;
        this.pubsubTopic = Objects.requireNonNull(pubsubTopic, "expected parameter 'pubsubTopic' to be non-null");
    }

    private Hl7StoreNotificationConfigsGetArgs() {
        this.filter = Codegen.empty();
        this.pubsubTopic = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreNotificationConfigsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> filter;
        private Output<String> pubsubTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreNotificationConfigsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.pubsubTopic = defaults.pubsubTopic;
        }

        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder pubsubTopic(Output<String> pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }
        public Builder pubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Output.of(Objects.requireNonNull(pubsubTopic));
            return this;
        }        public Hl7StoreNotificationConfigsGetArgs build() {
            return new Hl7StoreNotificationConfigsGetArgs(filter, pubsubTopic);
        }
    }
}

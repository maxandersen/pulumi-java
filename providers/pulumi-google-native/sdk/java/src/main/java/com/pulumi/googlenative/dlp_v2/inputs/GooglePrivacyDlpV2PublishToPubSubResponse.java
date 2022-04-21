// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Publish a message into given Pub/Sub topic when DlpJob has completed. The message contains a single field, `DlpJobName`, which is equal to the finished job&#39;s [`DlpJob.name`](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.dlpJobs#DlpJob). Compatible with: Inspect, Risk
 * 
 */
public final class GooglePrivacyDlpV2PublishToPubSubResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2PublishToPubSubResponse Empty = new GooglePrivacyDlpV2PublishToPubSubResponse();

    /**
     * Cloud Pub/Sub topic to send notifications to. The topic must have given publishing access rights to the DLP API service account executing the long running DlpJob sending the notifications. Format is projects/{project}/topics/{topic}.
     * 
     */
    @Import(name="topic", required=true)
    private String topic;

    public String topic() {
        return this.topic;
    }

    private GooglePrivacyDlpV2PublishToPubSubResponse() {}

    private GooglePrivacyDlpV2PublishToPubSubResponse(GooglePrivacyDlpV2PublishToPubSubResponse $) {
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2PublishToPubSubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2PublishToPubSubResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2PublishToPubSubResponse();
        }

        public Builder(GooglePrivacyDlpV2PublishToPubSubResponse defaults) {
            $ = new GooglePrivacyDlpV2PublishToPubSubResponse(Objects.requireNonNull(defaults));
        }

        public Builder topic(String topic) {
            $.topic = topic;
            return this;
        }

        public GooglePrivacyDlpV2PublishToPubSubResponse build() {
            $.topic = Objects.requireNonNull($.topic, "expected parameter 'topic' to be non-null");
            return $;
        }
    }

}

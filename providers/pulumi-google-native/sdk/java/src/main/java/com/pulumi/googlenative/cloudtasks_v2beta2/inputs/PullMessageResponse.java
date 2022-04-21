// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The pull message contains data that can be used by the caller of LeaseTasks to process the task. This proto can only be used for tasks in a queue which has pull_target set.
 * 
 */
public final class PullMessageResponse extends com.pulumi.resources.InvokeArgs {

    public static final PullMessageResponse Empty = new PullMessageResponse();

    /**
     * A data payload consumed by the worker to execute the task.
     * 
     */
    @Import(name="payload", required=true)
    private String payload;

    public String payload() {
        return this.payload;
    }

    /**
     * The task&#39;s tag. Tags allow similar tasks to be processed in a batch. If you label tasks with a tag, your worker can lease tasks with the same tag using filter. For example, if you want to aggregate the events associated with a specific user once a day, you could tag tasks with the user ID. The task&#39;s tag can only be set when the task is created. The tag must be less than 500 characters. SDK compatibility: Although the SDK allows tags to be either string or [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-), only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn&#39;t UTF-8 encoded, the tag will be empty when the task is returned by Cloud Tasks.
     * 
     */
    @Import(name="tag", required=true)
    private String tag;

    public String tag() {
        return this.tag;
    }

    private PullMessageResponse() {}

    private PullMessageResponse(PullMessageResponse $) {
        this.payload = $.payload;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PullMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PullMessageResponse $;

        public Builder() {
            $ = new PullMessageResponse();
        }

        public Builder(PullMessageResponse defaults) {
            $ = new PullMessageResponse(Objects.requireNonNull(defaults));
        }

        public Builder payload(String payload) {
            $.payload = payload;
            return this;
        }

        public Builder tag(String tag) {
            $.tag = tag;
            return this;
        }

        public PullMessageResponse build() {
            $.payload = Objects.requireNonNull($.payload, "expected parameter 'payload' to be non-null");
            $.tag = Objects.requireNonNull($.tag, "expected parameter 'tag' to be non-null");
            return $;
        }
    }

}

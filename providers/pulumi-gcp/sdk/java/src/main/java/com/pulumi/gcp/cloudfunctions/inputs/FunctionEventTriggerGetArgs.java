// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerFailurePolicyGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionEventTriggerGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionEventTriggerGetArgs Empty = new FunctionEventTriggerGetArgs();

    /**
     * The type of event to observe. For example: `&#34;google.storage.object.finalize&#34;`.
     * See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/) for a
     * full reference of accepted triggers.
     * 
     */
    @Import(name="eventType", required=true)
    private Output<String> eventType;

    public Output<String> eventType() {
        return this.eventType;
    }

    /**
     * Specifies policy for failed executions. Structure is documented below.
     * 
     */
    @Import(name="failurePolicy")
    private @Nullable Output<FunctionEventTriggerFailurePolicyGetArgs> failurePolicy;

    public Optional<Output<FunctionEventTriggerFailurePolicyGetArgs>> failurePolicy() {
        return Optional.ofNullable(this.failurePolicy);
    }

    /**
     * Required. The name or partial URI of the resource from
     * which to observe events. For example, `&#34;myBucket&#34;` or `&#34;projects/my-project/topics/my-topic&#34;`
     * 
     */
    @Import(name="resource", required=true)
    private Output<String> resource;

    public Output<String> resource() {
        return this.resource;
    }

    private FunctionEventTriggerGetArgs() {}

    private FunctionEventTriggerGetArgs(FunctionEventTriggerGetArgs $) {
        this.eventType = $.eventType;
        this.failurePolicy = $.failurePolicy;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionEventTriggerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionEventTriggerGetArgs $;

        public Builder() {
            $ = new FunctionEventTriggerGetArgs();
        }

        public Builder(FunctionEventTriggerGetArgs defaults) {
            $ = new FunctionEventTriggerGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder eventType(Output<String> eventType) {
            $.eventType = eventType;
            return this;
        }

        public Builder eventType(String eventType) {
            return eventType(Output.of(eventType));
        }

        public Builder failurePolicy(@Nullable Output<FunctionEventTriggerFailurePolicyGetArgs> failurePolicy) {
            $.failurePolicy = failurePolicy;
            return this;
        }

        public Builder failurePolicy(FunctionEventTriggerFailurePolicyGetArgs failurePolicy) {
            return failurePolicy(Output.of(failurePolicy));
        }

        public Builder resource(Output<String> resource) {
            $.resource = resource;
            return this;
        }

        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public FunctionEventTriggerGetArgs build() {
            $.eventType = Objects.requireNonNull($.eventType, "expected parameter 'eventType' to be non-null");
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            return $;
        }
    }

}

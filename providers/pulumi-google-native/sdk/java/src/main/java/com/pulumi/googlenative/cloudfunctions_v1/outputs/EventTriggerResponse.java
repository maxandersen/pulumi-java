// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudfunctions_v1.outputs.FailurePolicyResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventTriggerResponse {
    /**
     * The type of event to observe. For example: `providers/cloud.storage/eventTypes/object.change` and `providers/cloud.pubsub/eventTypes/topic.publish`. Event types match pattern `providers/*{@literal /}eventTypes/*.*`. The pattern contains: 1. namespace: For example, `cloud.storage` and `google.firebase.analytics`. 2. resource type: The type of resource on which event occurs. For example, the Google Cloud Storage API includes the type `object`. 3. action: The action that generates the event. For example, action for a Google Cloud Storage Object is 'change'. These parts are lower case.
     * 
     */
    private final String eventType;
    /**
     * Specifies policy for failed executions.
     * 
     */
    private final FailurePolicyResponse failurePolicy;
    /**
     * The resource(s) from which to observe events, for example, `projects/_/buckets/myBucket`. Not all syntactically correct values are accepted by all services. For example: 1. The authorization model must support it. Google Cloud Functions only allows EventTriggers to be deployed that observe resources in the same project as the `CloudFunction`. 2. The resource type must match the pattern expected for an `event_type`. For example, an `EventTrigger` that has an `event_type` of "google.pubsub.topic.publish" should have a resource that matches Google Cloud Pub/Sub topics. Additionally, some services may support short names when creating an `EventTrigger`. These will always be returned in the normalized "long" format. See each *service's* documentation for supported formats.
     * 
     */
    private final String resource;
    /**
     * The hostname of the service that should be observed. If no string is provided, the default service implementing the API will be used. For example, `storage.googleapis.com` is the default for all event types in the `google.storage` namespace.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private EventTriggerResponse(
        @CustomType.Parameter("eventType") String eventType,
        @CustomType.Parameter("failurePolicy") FailurePolicyResponse failurePolicy,
        @CustomType.Parameter("resource") String resource,
        @CustomType.Parameter("service") String service) {
        this.eventType = eventType;
        this.failurePolicy = failurePolicy;
        this.resource = resource;
        this.service = service;
    }

    /**
     * The type of event to observe. For example: `providers/cloud.storage/eventTypes/object.change` and `providers/cloud.pubsub/eventTypes/topic.publish`. Event types match pattern `providers/*{@literal /}eventTypes/*.*`. The pattern contains: 1. namespace: For example, `cloud.storage` and `google.firebase.analytics`. 2. resource type: The type of resource on which event occurs. For example, the Google Cloud Storage API includes the type `object`. 3. action: The action that generates the event. For example, action for a Google Cloud Storage Object is 'change'. These parts are lower case.
     * 
    */
    public String eventType() {
        return this.eventType;
    }
    /**
     * Specifies policy for failed executions.
     * 
    */
    public FailurePolicyResponse failurePolicy() {
        return this.failurePolicy;
    }
    /**
     * The resource(s) from which to observe events, for example, `projects/_/buckets/myBucket`. Not all syntactically correct values are accepted by all services. For example: 1. The authorization model must support it. Google Cloud Functions only allows EventTriggers to be deployed that observe resources in the same project as the `CloudFunction`. 2. The resource type must match the pattern expected for an `event_type`. For example, an `EventTrigger` that has an `event_type` of "google.pubsub.topic.publish" should have a resource that matches Google Cloud Pub/Sub topics. Additionally, some services may support short names when creating an `EventTrigger`. These will always be returned in the normalized "long" format. See each *service's* documentation for supported formats.
     * 
    */
    public String resource() {
        return this.resource;
    }
    /**
     * The hostname of the service that should be observed. If no string is provided, the default service implementing the API will be used. For example, `storage.googleapis.com` is the default for all event types in the `google.storage` namespace.
     * 
    */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventType;
        private FailurePolicyResponse failurePolicy;
        private String resource;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.failurePolicy = defaults.failurePolicy;
    	      this.resource = defaults.resource;
    	      this.service = defaults.service;
        }

        public Builder eventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        public Builder failurePolicy(FailurePolicyResponse failurePolicy) {
            this.failurePolicy = Objects.requireNonNull(failurePolicy);
            return this;
        }
        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public EventTriggerResponse build() {
            return new EventTriggerResponse(eventType, failurePolicy, resource, service);
        }
    }
}

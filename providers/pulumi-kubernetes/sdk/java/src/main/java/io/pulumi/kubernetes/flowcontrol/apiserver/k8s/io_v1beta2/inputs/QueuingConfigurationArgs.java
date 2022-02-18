// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * QueuingConfiguration holds the configuration parameters for queuing
 * 
 */
public final class QueuingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueuingConfigurationArgs Empty = new QueuingConfigurationArgs();

    /**
     * `handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request's flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
     * 
     */
    @InputImport(name="handSize")
    private final @Nullable Input<Integer> handSize;

    public Input<Integer> getHandSize() {
        return this.handSize == null ? Input.empty() : this.handSize;
    }

    /**
     * `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
     * 
     */
    @InputImport(name="queueLengthLimit")
    private final @Nullable Input<Integer> queueLengthLimit;

    public Input<Integer> getQueueLengthLimit() {
        return this.queueLengthLimit == null ? Input.empty() : this.queueLengthLimit;
    }

    /**
     * `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
     * 
     */
    @InputImport(name="queues")
    private final @Nullable Input<Integer> queues;

    public Input<Integer> getQueues() {
        return this.queues == null ? Input.empty() : this.queues;
    }

    public QueuingConfigurationArgs(
        @Nullable Input<Integer> handSize,
        @Nullable Input<Integer> queueLengthLimit,
        @Nullable Input<Integer> queues) {
        this.handSize = handSize;
        this.queueLengthLimit = queueLengthLimit;
        this.queues = queues;
    }

    private QueuingConfigurationArgs() {
        this.handSize = Input.empty();
        this.queueLengthLimit = Input.empty();
        this.queues = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueuingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> handSize;
        private @Nullable Input<Integer> queueLengthLimit;
        private @Nullable Input<Integer> queues;

        public Builder() {
    	      // Empty
        }

        public Builder(QueuingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.handSize = defaults.handSize;
    	      this.queueLengthLimit = defaults.queueLengthLimit;
    	      this.queues = defaults.queues;
        }

        public Builder setHandSize(@Nullable Input<Integer> handSize) {
            this.handSize = handSize;
            return this;
        }

        public Builder setHandSize(@Nullable Integer handSize) {
            this.handSize = Input.ofNullable(handSize);
            return this;
        }

        public Builder setQueueLengthLimit(@Nullable Input<Integer> queueLengthLimit) {
            this.queueLengthLimit = queueLengthLimit;
            return this;
        }

        public Builder setQueueLengthLimit(@Nullable Integer queueLengthLimit) {
            this.queueLengthLimit = Input.ofNullable(queueLengthLimit);
            return this;
        }

        public Builder setQueues(@Nullable Input<Integer> queues) {
            this.queues = queues;
            return this;
        }

        public Builder setQueues(@Nullable Integer queues) {
            this.queues = Input.ofNullable(queues);
            return this;
        }

        public QueuingConfigurationArgs build() {
            return new QueuingConfigurationArgs(handSize, queueLengthLimit, queues);
        }
    }
}

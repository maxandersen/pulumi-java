// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Options for tuning the Kubernetes client used by a Provider.
 * 
 */
public final class KubeClientSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubeClientSettingsArgs Empty = new KubeClientSettingsArgs();

    /**
     * Maximum burst for throttle. Default value is 10.
     * 
     */
    @Import(name="burst")
    private @Nullable Output<Integer> burst;

    public Optional<Output<Integer>> burst() {
        return Optional.ofNullable(this.burst);
    }

    /**
     * Maximum queries per second (QPS) to the API server from this client. Default value is 5.
     * 
     */
    @Import(name="qps")
    private @Nullable Output<Double> qps;

    public Optional<Output<Double>> qps() {
        return Optional.ofNullable(this.qps);
    }

    private KubeClientSettingsArgs() {}

    private KubeClientSettingsArgs(KubeClientSettingsArgs $) {
        this.burst = $.burst;
        this.qps = $.qps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubeClientSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubeClientSettingsArgs $;

        public Builder() {
            $ = new KubeClientSettingsArgs();
        }

        public Builder(KubeClientSettingsArgs defaults) {
            $ = new KubeClientSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder burst(@Nullable Output<Integer> burst) {
            $.burst = burst;
            return this;
        }

        public Builder burst(Integer burst) {
            return burst(Output.of(burst));
        }

        public Builder qps(@Nullable Output<Double> qps) {
            $.qps = qps;
            return this;
        }

        public Builder qps(Double qps) {
            return qps(Output.of(qps));
        }

        public KubeClientSettingsArgs build() {
            $.burst = Codegen.integerProp("burst").output().arg($.burst).env("PULUMI_K8S_CLIENT_BURST").getNullable();
            $.qps = Codegen.doubleProp("qps").output().arg($.qps).env("PULUMI_K8S_CLIENT_QPS").getNullable();
            return $;
        }
    }

}

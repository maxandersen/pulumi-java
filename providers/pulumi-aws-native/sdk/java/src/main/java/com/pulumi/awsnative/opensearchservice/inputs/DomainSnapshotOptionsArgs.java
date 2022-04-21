// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.opensearchservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainSnapshotOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainSnapshotOptionsArgs Empty = new DomainSnapshotOptionsArgs();

    @Import(name="automatedSnapshotStartHour")
    private @Nullable Output<Integer> automatedSnapshotStartHour;

    public Optional<Output<Integer>> automatedSnapshotStartHour() {
        return Optional.ofNullable(this.automatedSnapshotStartHour);
    }

    private DomainSnapshotOptionsArgs() {}

    private DomainSnapshotOptionsArgs(DomainSnapshotOptionsArgs $) {
        this.automatedSnapshotStartHour = $.automatedSnapshotStartHour;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainSnapshotOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainSnapshotOptionsArgs $;

        public Builder() {
            $ = new DomainSnapshotOptionsArgs();
        }

        public Builder(DomainSnapshotOptionsArgs defaults) {
            $ = new DomainSnapshotOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder automatedSnapshotStartHour(@Nullable Output<Integer> automatedSnapshotStartHour) {
            $.automatedSnapshotStartHour = automatedSnapshotStartHour;
            return this;
        }

        public Builder automatedSnapshotStartHour(Integer automatedSnapshotStartHour) {
            return automatedSnapshotStartHour(Output.of(automatedSnapshotStartHour));
        }

        public DomainSnapshotOptionsArgs build() {
            return $;
        }
    }

}

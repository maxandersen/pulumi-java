// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.redis_v1.enums.PersistenceConfigPersistenceMode;
import com.pulumi.googlenative.redis_v1.enums.PersistenceConfigRdbSnapshotPeriod;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of the persistence functionality.
 * 
 */
public final class PersistenceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PersistenceConfigArgs Empty = new PersistenceConfigArgs();

    /**
     * Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
     * 
     */
    @Import(name="persistenceMode")
      private final @Nullable Output<PersistenceConfigPersistenceMode> persistenceMode;

    public Output<PersistenceConfigPersistenceMode> persistenceMode() {
        return this.persistenceMode == null ? Codegen.empty() : this.persistenceMode;
    }

    /**
     * Optional. Period between RDB snapshots. Snapshots will be attempted every period starting from the provided snapshot start time. For example, a start time of 01/01/2033 06:45 and SIX_HOURS snapshot period will do nothing until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45, 18:45, and 00:45 the next day, and so on. If not provided, TWENTY_FOUR_HOURS will be used as default.
     * 
     */
    @Import(name="rdbSnapshotPeriod")
      private final @Nullable Output<PersistenceConfigRdbSnapshotPeriod> rdbSnapshotPeriod;

    public Output<PersistenceConfigRdbSnapshotPeriod> rdbSnapshotPeriod() {
        return this.rdbSnapshotPeriod == null ? Codegen.empty() : this.rdbSnapshotPeriod;
    }

    /**
     * Optional. Date and time that the first snapshot was/will be attempted, and to which future snapshots will be aligned. If not provided, the current time will be used.
     * 
     */
    @Import(name="rdbSnapshotStartTime")
      private final @Nullable Output<String> rdbSnapshotStartTime;

    public Output<String> rdbSnapshotStartTime() {
        return this.rdbSnapshotStartTime == null ? Codegen.empty() : this.rdbSnapshotStartTime;
    }

    public PersistenceConfigArgs(
        @Nullable Output<PersistenceConfigPersistenceMode> persistenceMode,
        @Nullable Output<PersistenceConfigRdbSnapshotPeriod> rdbSnapshotPeriod,
        @Nullable Output<String> rdbSnapshotStartTime) {
        this.persistenceMode = persistenceMode;
        this.rdbSnapshotPeriod = rdbSnapshotPeriod;
        this.rdbSnapshotStartTime = rdbSnapshotStartTime;
    }

    private PersistenceConfigArgs() {
        this.persistenceMode = Codegen.empty();
        this.rdbSnapshotPeriod = Codegen.empty();
        this.rdbSnapshotStartTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistenceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PersistenceConfigPersistenceMode> persistenceMode;
        private @Nullable Output<PersistenceConfigRdbSnapshotPeriod> rdbSnapshotPeriod;
        private @Nullable Output<String> rdbSnapshotStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistenceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.persistenceMode = defaults.persistenceMode;
    	      this.rdbSnapshotPeriod = defaults.rdbSnapshotPeriod;
    	      this.rdbSnapshotStartTime = defaults.rdbSnapshotStartTime;
        }

        public Builder persistenceMode(@Nullable Output<PersistenceConfigPersistenceMode> persistenceMode) {
            this.persistenceMode = persistenceMode;
            return this;
        }
        public Builder persistenceMode(@Nullable PersistenceConfigPersistenceMode persistenceMode) {
            this.persistenceMode = Codegen.ofNullable(persistenceMode);
            return this;
        }
        public Builder rdbSnapshotPeriod(@Nullable Output<PersistenceConfigRdbSnapshotPeriod> rdbSnapshotPeriod) {
            this.rdbSnapshotPeriod = rdbSnapshotPeriod;
            return this;
        }
        public Builder rdbSnapshotPeriod(@Nullable PersistenceConfigRdbSnapshotPeriod rdbSnapshotPeriod) {
            this.rdbSnapshotPeriod = Codegen.ofNullable(rdbSnapshotPeriod);
            return this;
        }
        public Builder rdbSnapshotStartTime(@Nullable Output<String> rdbSnapshotStartTime) {
            this.rdbSnapshotStartTime = rdbSnapshotStartTime;
            return this;
        }
        public Builder rdbSnapshotStartTime(@Nullable String rdbSnapshotStartTime) {
            this.rdbSnapshotStartTime = Codegen.ofNullable(rdbSnapshotStartTime);
            return this;
        }        public PersistenceConfigArgs build() {
            return new PersistenceConfigArgs(persistenceMode, rdbSnapshotPeriod, rdbSnapshotStartTime);
        }
    }
}

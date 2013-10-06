package org.syncany.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.syncany.tests.scenarios.AllFilePossibilitiesScenarioTest;
import org.syncany.tests.scenarios.CallUpWhileStillWritingFileScenarioTest;
import org.syncany.tests.scenarios.ChangedTypeScenarioTest;
import org.syncany.tests.scenarios.ChangedModifiedDateScenarioTest;
import org.syncany.tests.scenarios.CreateSimilarFileParallelScenarioTest;
import org.syncany.tests.scenarios.DirtyDatabaseScenarioTest;
import org.syncany.tests.scenarios.EmptyFileScenarioTest;
import org.syncany.tests.scenarios.EmptyFolderScenarioTest;
import org.syncany.tests.scenarios.EvilCUpWithoutDownScenarioTest;
import org.syncany.tests.scenarios.FileLockedScenarioTest;
import org.syncany.tests.scenarios.FileTreeMoveToSubfolderScenarioTest;
import org.syncany.tests.scenarios.FileVanishedScenarioTest;
import org.syncany.tests.scenarios.ManyRenamesScenarioTest;
import org.syncany.tests.scenarios.ManySyncUpsAndDatabaseFileCleanupTest;
import org.syncany.tests.scenarios.ManySyncUpsAndOtherClientSyncDownTest;
import org.syncany.tests.scenarios.MixedUpDownScenarioTest;
import org.syncany.tests.scenarios.RenameDeleteScenarioTest;
import org.syncany.tests.scenarios.RenameToExistingFileScenarioTest;
import org.syncany.tests.scenarios.SingleFileNoConflictsScenarioTest;
import org.syncany.tests.scenarios.SingleFolderNoConflictsScenarioTest;
import org.syncany.tests.scenarios.SymlinkIgnoreScenarioTest;

@RunWith(Suite.class)
@SuiteClasses({
	AllFilePossibilitiesScenarioTest.class,
	CallUpWhileStillWritingFileScenarioTest.class,
	ChangedModifiedDateScenarioTest.class,
	ChangedTypeScenarioTest.class,
	CreateSimilarFileParallelScenarioTest.class,
	DirtyDatabaseScenarioTest.class,
	EmptyFileScenarioTest.class,
	EmptyFolderScenarioTest.class,
	EvilCUpWithoutDownScenarioTest.class,
	FileLockedScenarioTest.class,
	FileTreeMoveToSubfolderScenarioTest.class,
	FileVanishedScenarioTest.class,
	ManyRenamesScenarioTest.class,
	ManySyncUpsAndDatabaseFileCleanupTest.class,
	ManySyncUpsAndOtherClientSyncDownTest.class,
	MixedUpDownScenarioTest.class,
	RenameToExistingFileScenarioTest.class,
	RenameDeleteScenarioTest.class,
	SingleFileNoConflictsScenarioTest.class,
	SingleFolderNoConflictsScenarioTest.class,
	SymlinkIgnoreScenarioTest.class
})
public class ScenarioTests {
	// This class executes all tests
}
